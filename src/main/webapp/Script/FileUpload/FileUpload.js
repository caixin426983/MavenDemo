/**
 * Created by Administrator on 2017-9-30.
 */

/**
 * 初始化页面
 */
$(function () {

});


function UploadFile() {

    //js获取文件对象
    var fileObj = $("#file").files;
    //接受上传文件的后台地址
    var FileController = "http://localhost:8081/web-ssm/fileUpload/importPicFile.do";

    //FormDate对象
    var form = new FormData($("#uploadForm")[0]);
    //XMLHttpRequest 对象
    var xhr = new  XMLHttpRequest();
    xhr.open("post",FileController,true);
    xhr.onload=function (data) {
        alert(data);
    };
    xhr.upload.addEventListener("progress", progressFunction, false);
    xhr.send(form);
}


function progressFunction(evt) {
    var progressBar = document.getElementById("progressBar");
    var percentageDiv = document.getElementById("percentage");
    if (evt.lengthComputable) {
        progressBar.max = evt.total;
        progressBar.value = evt.loaded;
        percentageDiv.innerHTML = Math.round(evt.loaded / evt.total * 100) + "%";
        if(evt.loaded==evt.total){

        }
    }
}



//上传
function doUpload() {
    var formData = new FormData($("#uploadForm")[0]);
    $.ajax({
        url: 'http://localhost:8081/web-ssm/fileUpload/importPicFile.do' ,
        type: 'POST',
        data: formData,
        async: false,
        cache: false,
        contentType: false,
        processData: false,
        success: function (returndata) {
            console.log(returndata);
        },
        error: function (returndata) {
            console.log(returndata);
        }
    });
}



