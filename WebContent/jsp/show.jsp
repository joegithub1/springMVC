<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/mytag.jsp" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>show.jsp</title>
</head>
<body>
	<p>${p.name }  ${p.age }</p>
	
	<div>
		<table>
			<tr>
				<td>姓名：</td>
				<td>
				<input type="text" name="name" value="joes"/>
				</td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td>
				<input type="text" name="age" value="25"/>
				</td>
				<td>
				<input id="btn" onclick="show()" type="button" value="提交" />
				</td>
			</tr>
		</table>
		
	</div>
	<script type="text/javascript" src="${ctx }/js/jquery-1.8.3.min.js" ></script>
	<script type="text/javascript">
	function show(){
		$.post("${ctx}/mvc/getPersion",{name:$("[name=name]").val(),age:$("[name=age]").val()},function(data){
			
			console.log(data);
		});
		
	}
	$(document).ready(function(){
		
	});
	</script>
</body>
</html>