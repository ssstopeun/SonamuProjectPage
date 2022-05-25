$(function(){
    // 파일 불러오기 onChange event
    $("#openCode").change(function () {
        const content = $("#inputText");
        const file = this.files[0];
        const reader = new FileReader();

        reader.addEventListener("load", () => {
            content.html(reader.result);
        }, false);

        if (file) {
            reader.readAsText(file);
        }
    });

    // 파일 저장하기 onClick event
    $("#saveCode").click(function () {
        const fileName = $("#fileName").val();
        const content = $("#outputText").val();

        if (fileName) {
            downloadFile(fileName, content);
        } else {
            alert("저장할 파일의 이름을 입력하세요.");
        }
    })
});

function downloadFile(fileName, content) {

    // 저장할 파일과 주소 생성
    const blob = new Blob([content], { type: 'plain/text' });
    const fileUrl = URL.createObjectURL(blob);

    // click 될 a 태그 생성
    const element = $("<a>").hide();
    element.attr('href', fileUrl);
    element.attr('download', fileName);

    // click 후 remove
    element[0].click();
    element.remove();
}



