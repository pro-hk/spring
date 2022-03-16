    const dateUl = $(".calendar .dates ul");
    const now = new Date(); // 오늘 날짜
    let pickedNow = new Date(); // 버튼 클릭했을 때, 넘어갈 날짜
    
    const dayList = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"]

    let firstDay = new Date(now.getFullYear(), now.getMonth(), 1);
    // 현재 날짜의 월에서 1일을 기준으로 새로운 date 생성
    const nonLeapYear = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    const leapYear = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    let selectYear;

    let btnNextMonth = $(".calendar .header .next");
    let btnPrevMonth = $(".calendar .header .prev");
    const txtYear = $(".calendar .header .year");
    const txtMonth = $(".calendar .header .month");
    
    let queryDate="";

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
      
      queryDate = now.getFullYear() + "" + addZero(now.getMonth()+1) + "" + addZero(now.getDate());
      const sendData = {
			pickedDate: queryDate
		}
		$.ajax({
			url:"List.do",
			data:JSON.stringify(sendData),
			contentType:"application/json",
			dataType:"json",
			method:"POST",
			success:function(res){
				$(".todoList").html("");
				$.each(res.todoList, function(idx, item){
					$(".todoList").append(`
						<li data-no="${item.no}" class="${item.done}">
						<span class="txt">${item.todo}</span>
						<button class="btnDelete"><span class="material-icons">delete</span></button>
						</li>`)
				})
			},
			error:function(err){
				console.log(err)
			}
		})

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
	// 이벤트 위임
    $("body").on("click",".calendar .dates li",function(){
		const selectDay = $(this).data("year")+addZero($(this).data("month")+1)+addZero($(this).data("date"));
		/*console.log(selectDay);*/
		queryDate = selectDay;
		$(this).addClass("on").siblings().removeClass("on");
		const clickNow = new Date($(this).data("year"),addZero($(this).data("month")),addZero($(this).data("date")));
		/*console.log(clickNow);
		console.log(clickNow.getDay());*/
		$("#pickedDate").text(addZero(clickNow.getDate()));
		$("#pickedDay").text(dayList[clickNow.getDay()]);
		const sendData = {
			pickedDate: queryDate
		}
		$.ajax({
			url:"List.do",
			data:JSON.stringify(sendData),
			contentType:"application/json",
			dataType:"json",
			method:"POST",
			success:function(res){
				$(".todoList").html("");
				$.each(res.todoList, function(idx, item){
					$(".todoList").append(`
						<li data-no="${item.no}" class="${item.done}">
						<span class="txt">${item.todo}</span>
						<button class="btnDelete"><span class="material-icons">delete</span></button>
						</li>`)
				})
			},
			error:function(err){
				console.log(err)
			}
		})
	});
	
    function addZero(num) {
      if (num < 10) {
        return "0" + num;
      } else {
        return "" + num;
      }
    }
    
	$("body").on("click",".todoList li .btnDelete",function(){
		const clickItem = $(this).parent();
		const sendData = {
			no: $(this).parent().data("no")
		}
		$.ajax({
			url:"Delete.do",
			data:JSON.stringify(sendData),
			contentType:"application/json", // 보내는 데이터의 타입
			dataType:"json",                // 받는 데이터의 타입
			method:"POST",
			success:function(res){
				/*console.log(res);*/
				if(res.result > 0){
					/*clickItem.remove();*/
					gsap.to(clickItem,{x:-500, ease:"power3", onComplete:function(){
						clickItem.remove();
					}})
				}
			},
			error:function(err){
				console.log(err);
			}
		})
	});
	
	$("body").on("click",".todoList li .txt",function(){
		console.log($(this).parent().data("no"));
		const clickItem = $(this).parent();
		let state="";
		if(clickItem.hasClass("done")){
			state="none";
		} else{
			state="done";
		}
		console.log(state);
		const sendData = {
			no: $(this).parent().data("no"),
			done:state
		}
		$.ajax({
			url:"Update.do",
			data:JSON.stringify(sendData),
			contentType:"application/json",
			dataType:"json",
			method:"POST",
			success:function(res){
				console.log(res);
				if(res.result > 0){
					if(clickItem.hasClass("none")){
						clickItem.removeClass().addClass("done");
					} else{
						clickItem.removeClass().addClass("none");
					}
				}
			},
			error:function(err){
				console.log(err);
			}
		})
	})

    $(".todo .btnAdd").on("click",function(){
		if($.trim($("#todoTxt").val())===""){
			alert("할일을 입력해 주세요.");
			$("#todoTxt").val("");
			$("#todoTxt").focus();
			return false;
		}
		const sendData = {
			todo: $("#todoTxt").val(),
			done: "none",
			pickedDate: queryDate
		}
		$.ajax({
			url:"Insert.do",
			data:JSON.stringify(sendData),
			contentType:"application/json", // 보내는 데이터의 타입
			dataType:"json",                // 받는 데이터의 타입
			method:"POST",
			success:function(res){
				//console.log(res);
				$(".todoList").html("");
				$.each(res.todoList, function(idx, item){
					$(".todoList").append(`
						<li data-no="${item.no}" class="${item.done}">
						<span class="txt">${item.todo}</span>
						<button class="btnDelete"><span class="material-icons">delete</span></button>
						</li>`)
				})
				$("#todoTxt").val("");
				$("#todoTxt").focus();
			},
			error:function(err){
				console.log(err)
			}
		})
	});