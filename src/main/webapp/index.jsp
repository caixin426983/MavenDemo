<html>
<title>纯字验证码</title>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript">
    var code;//在全局定义验证码
    function createCode() {
        code ="";
        var codeLength=4;//验证码的长度
        var checkCode = document.getElementById("code");
        var random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
                'S','T','U','V','W','X','Y','Z');//随机数
        for (var i=0;i<codeLength;i++){//循环操作
            var index=Math.floor(Math.random()*36);//取得随机数的索引（0——35）
            code +=random[index];//根据索引取得随机数加到code上
        }
        checkCode.value=code; //把code值赋值给验证码
    }
    //校验验证码
    function  validate() {
        var inputCode =document.getElementById("input").nodeValue.toUpperCase();//取得输入的验证码并转化为大写
        alert(inputCode);
        if (inputCode.length<=0){ //若输入的验证码长度为0
            alert("请输入验证码");
        }else if (inputCode!=code){
            alert("验证码输入错误");
            createCode();//刷新验证码
            document.getElementById("input").nodeValue="";//清空文本框
        }else {
            alert("合格！^_^")
        }
    }
</script>
<style type='text/css'>
    #code{
        font-family:Arial,宋体;
        font-style:italic;
        color:green;
        border:0;
        padding:2px 3px;
        letter-spacing:3px;
        font-weight:bolder;
    }
</style>


<body onload='createCode()'>
<div>
    验证码：
    <input type = "text" id = "input"/>
    <input type="button" id="code" onclick="createCode()" style="width:60px" title='点击更换验证码' />
    <button onclick="validate()" value="验证"/>
</div>

    <div>
        <input type = "text" id = "aaa"/>
        <button id="button" onclick="sousuo()"></button>
    </div>


</body>



<script type="text/javascript">

    $(function () {
        countQuestionnaireResult();
    })

    //统计投票结果
    function countQuestionnaireResult() {
        var param = {};
        param["stu.data"] = "aaaaa";
        param["stu.name"] = "张珊";
        $.ajax({
            type: 'POST',
            dataType: 'text',
            data: param,
            url: "http://localhost:8081/web-ssm/testController/postTest.do?",
            success: function (data) {
                console.log(data);
            }
        });
    }



</script>

</html>
