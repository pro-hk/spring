$.ajax({
  url: "JsonList.do",
  success: function (res) {
    //console.log(res);
    const list = res.galleryList;
    let output = "";
    $.each(list, function (idx, item) {
      const categories = item.category.split(",").join(" ");
      //console.log(categories);
      output += `
        <li class="item ${categories}" data-no="${item.no}">
          <a href="${item.img}" data-caption="${item.title}" data-fancybox="${categories}">
            <div class="imgBox">
              <img src="${item.img}" alt="" />
            </div>
            <div class="info">
              <h2>${item.title}</h2>
              <p class="desc">${item.contents}</p>
              <p class="point"><span>${item.point}</span></p>
            </div>
          <a>
        </li>
      `;
    });
    $("#list > ul").html(output);
    Fancybox.bind("[data-fancybox]");
    let grid = null;
    $("#list ul").imagesLoaded(function () {
      grid = $("#list ul").isotope({
        itemSelector: ".item",
        layoutMode: "masonry",
        getSortData: {
          point: ".point",
        },
      });
      $("#filter li").on("click", function () {
        $(this).addClass("on").siblings().removeClass("on");
        const flitering = $(this).data("filter");
        grid.isotope({
          filter: "." + flitering, // 클래스로 정렬하기 때문에 . 붙여줘야함
          sortBy: "point",
          sortAscending: false,
        });
      });
    });
  },
  error: function (err) {
    console.log(err);
  },
});
