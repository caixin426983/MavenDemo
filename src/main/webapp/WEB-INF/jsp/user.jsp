
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-6-16
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试</title>
</head>
<body>

    ${userEntity}

    <c:if test=" ${userEntity !=null}">

        <a>aAAAAAAAAAAAAAAAAAAAAAAA</a>
    </c:if>

</body>
</html>
