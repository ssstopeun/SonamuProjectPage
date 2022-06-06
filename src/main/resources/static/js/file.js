$(function(){
    // 파일 불러오기 onChange event
    $("#openCode").change(function() {
        const content = $("#inputText");
        const file = this.files[0];
        const reader = new FileReader();

        reader.addEventListener("load", () => {
            content.html(reader.result);
            resizeTextArea();
        }, false);

        if (file) {
            reader.readAsText(file);
        }
    });

    // 파일 저장하기 onClick event
    $("#saveCode").click(function() {
        const fileName = $("#fileName").val();
        const content = $("#outputText").val();

        if (fileName) {
            downloadFile(fileName, content);
        } else {
            alert("저장할 파일의 이름을 입력하세요!");
        }
    })

    // 언어 종류 선택하지 않았을 시 summit 되지 않도록 함
    $("#translateForm").submit(function() {
        if ($("input[name='typeOfCode']:checked").val() === undefined) {
            alert('입력 언어를 선택하세요!');
            return false;
        }
        return true;
    })

    // inputText에 코드 입력 시 textarea 크기 자동 조절
    $("#inputText").on('propertychange change keyup paste input', function () {
        $(this).height(1).height($(this).prop('scrollHeight')+5 );
    });

    // 페이지 최초 로드 시 textarea 크기 자동 조절
    resizeTextArea();
});

function resizeTextArea() {
    $("#inputText").height(1).height($("#inputText").prop('scrollHeight')+5 );
    $("#outputText").height(1).height($("#outputText").prop('scrollHeight')+5 );
}

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



