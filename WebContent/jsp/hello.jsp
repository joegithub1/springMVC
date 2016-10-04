<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/mytag.jsp" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello.jsp</title>
<style type="text/css">
.err{
 color:red;
}

</style>
</head>
<body>
<h1>Hello hello.jsp</h1>
<form:form method="post" modelAttribute="user" action="${ctx }/user/add">
  id:<form:input path="id"/><form:errors path="id" cssClass="err"></form:errors><br/>
  name:<form:input path="name"/><form:errors path="name" cssClass="err"></form:errors><br/>
  password:<form:password path="password"/><form:errors path="password" cssClass="err"></form:errors><br/>
  birthday:<form:input path="birthday"/><form:errors path="birthday" cssClass="err"></form:errors><br/>
  
  
  <input type="submit" value="submit"><br/><br/><br/>
  <form:errors path="*" cssClass="err"></form:errors>
</form:form>
</body>
</html>