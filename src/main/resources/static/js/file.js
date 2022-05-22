// 파일 저장
function downloadFile(filename, content) {

    const element = document.createElement('a');
    const blob = new Blob([content], { type: 'plain/text' });
    const fileUrl = URL.createObjectURL(blob);

    element.setAttribute('href', fileUrl); //file location
    element.setAttribute('download', filename); // file name
    element.style.display = 'none';
    document.body.appendChild(element);
    element.click();
    document.body.removeChild(element);
}

function downloadFileEntry() {
    const filename = document.getElementById('filename').value;
    const content = document.getElementById('outputText').value;

    console.log("download works?");

    if (filename && content) {
        downloadFile(filename, content);
    }
}

// 파일 열기
function openTextFile() {
    const content = document.querySelector('#inputText');
    const [file] = document.querySelector('#openCode').files;
    const reader = new FileReader();

    reader.addEventListener("load", () => {
        // this will then display a text file
        content.innerHTML = reader.result.replace(/\r\n|\r|\n/, "\n");
    }, false);

    if (file) {
        reader.readAsText(file);
    }
}

