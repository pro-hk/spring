const dateUl = $(".calendar .dates ul");
const now = new Date(); // 오늘 날짜
let pickedNow = new Date(); // 버튼 클릭했을 때, 넘어갈 날짜

const dayList = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"];

let firstDay = new Date(now.getFullYear(), now.getMonth(), 1);
// 현재 날짜의 월에서 1일을 기준으로 새로운 date 생성
const nonLeapYear = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
const leapYear = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
let selectYear;

let btnNextMonth = $(".calendar .header .next");
let btnPrevMonth = $(".calendar .header .prev");
const txtYear = $(".calendar .header .year");
const txtMonth = $(".calendar .header .month");

let queryDate = "";

btnPrevMonth.on("click", () => {
  pickedNow = new Date(pickedNow.getFullYear(), pickedNow.getMonth() - 1, 1);
  //console.log(pickedNow);
  makeCalendar(pickedNow.getFullYear(), pickedNow.getMonth());
});
btnNextMonth.on("click", () => {
  pickedNow = new Date(pickedNow.getFullYear(), pickedNow.getMonth() + 1, 1);
  //console.log(pickedNow);
  makeCalendar(pickedNow.getFullYear(), pickedNow.getMonth());
});
makeCalendar(pickedNow.getFullYear(), pickedNow.getMonth());
function makeCalendar(pYear, pMonth) {
  let output = "";
  let count = 1;
  firstDay = new Date(pYear, pMonth, 1);
  txtYear.text(firstDay.getFullYear());
  txtMonth.text(addZero(firstDay.getMonth() + 1));

  // 윤년(4로 나누어 떨어짐 & 100으로 나누어 떨어지지 않음 & 400으로 나누어 떨어짐)
  if (firstDay.getFullYear() % 4 === 0) {
    if (firstDay.getFullYear() % 100 === 0) {
      selectYear = nonLeapYear;
    } else {
      selectYear = leapYear;
    }
  } else {
    selectYear = nonLeapYear;
  }
  if (firstDay.getFullYear() % 400 === 0) {
    selectYear = leapYear;
  }

  queryDate = firstDay.getFullYear() + "" + addZero(firstDay.getMonth()) + "" + addZero(firstDay.getDate());
  $("#pickedDay").text(dayList[now.getDay()]);
  $("#pickedDate").text(addZero(now.getDate()));

  queryDate = now.getFullYear() + "" + addZero(now.getMonth() + 1) + "" + addZero(now.getDate());

  for (let i = 0; i < 42; i++) {
    if (i < firstDay.getDay()) {
      // 비워두기
      output += `<li class="blank"><span></span></li>`;
    } else {
      if (now.getDate() === count && now.getFullYear() === firstDay.getFullYear() && now.getMonth() === firstDay.getMonth()) {
        output += `<li class="today" data-date="${count}" data-year="${firstDay.getFullYear()}" data-month="${firstDay.getMonth()}"><span>${count}</span></li>`;
      } else {
        output += `<li data-date="${count}" data-year="${firstDay.getFullYear()}" data-month="${firstDay.getMonth()}"><span>${count}</span></li>`;
      }
      count += 1;
    }
    if (count > selectYear[firstDay.getMonth()]) {
      break;
      // 반복문이 break를 만나면 종료
    }
  }
  dateUl.html(output);
  gsap.from(".calendar .dates li", { scale: 0, ease: "power3", stagger: 0.02 });

  const dateLi = $(".calendar .dates li");
  let selectedDate;
  /*
	dateLi.forEach(function (item, idx) {
	  item.addEventListener("click", () => {
		// console.log(item.dataset.date);
		const selectDay = `${item.dataset.year}${addZero(parseInt(item.dataset.month) + 1)}${addZero(item.dataset.date)}`;
		// parseInt : 문자를 정수로 바꿈
		if (selectedDate) {
		  selectedDate.classList.remove("on");
		}
		selectedDate = item;
		selectedDate.classList.add("on");
		queryDate = selectDay;
	  });
	});
	*/
}

$("body").on("click", ".calendar .dates li", function () {
  showCorona($(this).data("year") + addZero($(this).data("month") + 1) + addZero($(this).data("date")));
  $(this).addClass("on").siblings().removeClass("on");
  $(".calendarBox").stop().fadeOut(250);
  $(".inputBox input").val($(this).data("year") + "/" + addZero($(this).data("month") + 1) + "/" + addZero($(this).data("date")));
});

function addZero(num) {
  if (num < 10) {
    return "0" + num;
  } else {
    return "" + num;
  }
}

showCorona(now.getFullYear() + addZero(now.getMonth() + 1) + addZero(now.getDate()));

let myChart = null;
function showCorona(_date) {
  const sendData = {
    date: _date,
  };
  $.ajax({
    url: "Corona.do",
    dataType: "json",
    data: sendData,
    success: function (res) {
      console.log(res);
      console.log(res.response.body.items.item);
      const cities = [];
      const incDecArray = [];
      $.each(res.response.body.items.item, function (idx, item) {
        cities.push(item.gubun);
        incDecArray.push(item.incDec);
      });

      const data = {
        labels: cities,
        datasets: [
          {
            label: "CORONA DATA",
            backgroundColor: [
              "#493B2A", // 배열로 색깔 변경 가능
              "#593F62",
              "#7B6D8D",
              "#FF101F",
              "#E1D89F",
              "#A72608",
              "#009FFD",
              "#2A2A72",
              "#493B2A",
              "#593F62",
              "#7B6D8D",
              "#FF101F",
              "#E1D89F",
              "#A72608",
              "#009FFD",
              "#2A2A72",
              "#493B2A",
              "#593F62",
              "#7B6D8D",
            ],
            borderColor: "rgb(255, 255, 255)",
            borderWidth: 2,
            data: incDecArray,
          },
        ],
      };

      const config = {
        type: "bar",
        data: data,
        options: {},
      };
      if (myChart !== null) {
        myChart.destroy();
      }
      myChart = new Chart(document.querySelector("#coronaChart"), config);
    },
    error: function (err) {
      console.log(err);
    },
  });
}

$(".calendarWrap .inputBox").on("click", function () {
  $(".calendarBox").stop().fadeToggle(250);
});
