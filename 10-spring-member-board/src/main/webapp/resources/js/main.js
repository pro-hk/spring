// 파일 선택
$(".fileBox input[type='file']").on("change",function(){
	const fileName = $(this).val();
    $(this).parent().siblings(".fakeFile").val(fileName);
})