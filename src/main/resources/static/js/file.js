$(function(){
    // 페이지 로드 시 확장자 자동 지정
    if ($("input[name='typeOfCode']:checked").val() === "sonamu") {
        $(".extension").text(".sol");
    }
    else {
        $(".extension").text(".sonamu");
    }

    // 언어 선택 라디오 버튼 이벤트
    $("input[name='typeOfCode']").click(function() {
        if ($("input[name='typeOfCode']:checked").val() === "sonamu") {
            $(".extension").text(".sol");
        }
        else {
            $(".extension").text(".sonamu");
        }
    })

    // 파일 불러오기 onChange event
    $("#openCode").change(function() {
        const content = $("#inputText");
        const file = this.files[0];
        const reader = new FileReader();

        reader.addEventListener("load", () => {
            content.text(reader.result);
            // resizeTextArea(); // 파일 불러오기 이후 창 크기 수정
        }, false);

        if (file) {
            reader.readAsText(file);
        }
    });

    // 파일 저장하기 onClick event
    $("#saveCode").click(function() {
        let fileName = $("#fileName").val();
        // 입력 언어에 따라 저장 언어의 확장자 자동 지정
        if ($("input[name='typeOfCode']:checked").val() === "sonamu") {
            fileName += ".sol";
        }
        else {
            fileName += ".sonamu";
        }
        const content = $("#outputText").val();

        if (fileName) {
            downloadFile(fileName, content);
        } else {
            alert("저장할 파일의 이름을 입력하세요!");
        }
    })

    // 맞춤법 검사 onClick event
    $("#spellCheck").click(async function () {
        const inputText = $("#inputText").val().replaceAll("'", "\"");
        const inputLength = inputText.length;

        const like = confirm("맞춤법 검사 글자 수 제한인 1000자를 초과하여\n" + (parseInt(inputLength / 1000) + 1) + "페이지로 나뉘어 실행됩니다.");

        const wait = (timeToDelay) => new Promise((resolve) => setTimeout(resolve, timeToDelay))

        if (like) {
            for (let i = 0; i < inputLength; i += 1000) {
                await wait(50); // delay

                const insdoc = "<input type='hidden' name='sentence' value='" + inputText.substring(i, i + 1000) + "'>";

                const goform = $("<form>", {
                    method: "post",
                    action: 'https://dic.daum.net/grammar_checker.do',
                    target: 'translate' + i,
                    html: insdoc
                }).appendTo("body");

                goform.submit();
            }
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
    // $("#inputText").on('propertychange change keyup paste input', function () {
    //     $(this).height(1).height($(this).prop('scrollHeight')+5 );
    // });

    // 페이지 최초 로드 시 textarea 크기 자동 조절
    // resizeTextArea();

    // 페이지 최초 로드 시 textarea에 줄 번호 표시
    $('.lined').linedtextarea();

});

// function resizeTextArea() {
//     // $("#inputText").height(1).height($("#inputText").prop('scrollHeight')+5 );
//     // $("#outputText").height(1).height($("#outputText").prop('scrollHeight')+5 );
// }

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



