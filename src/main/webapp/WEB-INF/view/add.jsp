<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <script src="resources/js/jquery-1.8.2.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	
	function add(){
		$.post("add",$("form").serialize(),function(obj){
			if(obj){
				alert("添加成功！")
				location="selects";
			}
		})
	}
	
</script>
</head>
<body>

	<form>
		名称:<input type="text" name="mname"><br><br>
		描述:<input type="text" name="miao"><br><br>
		作者:<input type="text" name="voter"><br><br>
		时间:<input type="date" name="datea"><br><br>
		分类:<c:forEach items="${movis }" var="s">
				<input type="checkbox" name="sids" value="${s.sid }">${s.sname }
			</c:forEach><br><br>
		<button type="button" onclick="add()">添加</button>		
	</form> 

</body>
</html>