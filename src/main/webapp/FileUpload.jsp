<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-9-29
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax实现文件上传</title>
    <base href="${pageContext.request.contextPath}/">
    <script src="http://libs.baidu.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="Script/FileUpload/FileUpload.js"></script>
</head>
<body>

            <progress id="progressBar" value="0" max="100"></progress>
            <span id="percentage"></span>
            <br/>
            <br/>
            <br/>
            <form id= "uploadForm">
                <input id="file" type="file" name="myFile" /><br/>
                <input type="button" value="上传" onclick="UploadFile()"/>
            </form>


            <div>
                <h3>文件下载</h3>
                <a href="http://localhost:8081/web-ssm/fileUpload/download.do?filename=">

                </a>
            </div>

</body>
</html>
