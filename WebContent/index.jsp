<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- prefix 不能命名 form -->
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
   
<%@ include file="/mytag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC index</title>
</head>
<body>
<h1>Hello spring</h1>

<h2>11.requestParam</h2>
<form action="${ctx }/test/param" method="post">
参数id:<input type="text" name="id" /><br/>
参数name:<input type="text" name="name" /><br/>
<input type="submit" value="submit"/>
</form>

<h2>restful风格</h2>
<form action="${ctx }/rest/user/1" method="get">
	<input type="submit" value="get submit"/>
</form>
<br/>
<form action="${ctx }/rest/user/1" method="post">
<input type="text" value="1"/>
	<input type="submit" value="post submit"/>
</form>

<h2>十六、表单的验证（使用Hibernate-validate）及国际化</h2>
<h4>未完成</h4>
<form:form action="${crx }/user/add" method="post" modelAttribute="user">
	id:<form:input path="id" /> <form:errors path="id" />  <br/>
	name：<input name="name" /><br/>
        <form:errors path="name"></form:errors><br/>
	birthday:<form:input path="birthday"/><form:errors path="birthday"/><br/>
	<form:textarea path="abc"/>
	<input type="submit" value="submit"/>
</form:form>
</body>
</html>