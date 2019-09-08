<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<script src="resources/js/jquery-1.8.2.min.js"></script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	function add(){
		location="toadd";
	}
	function chk(flag){
		if(flag==1){
			$(".ids").prop("checked",true);
		}else if(flag==2){
			$(".ids").prop("checked",false);
		}else{
			$(".ids").each(function(){
				this.checked=!this.checked
			});
		}
	}
	function del(id){
		alert(id)
		$.post("del",{id:id},function(obj){
			if(obj){
				alert("删除成功");
				location="selects"
			}
		})
	}
	
</script>
</head>
<body>
<center>
<h3>
	<form action="selects" method="post">
		姓名:<input type="text" name="mname" value="${mname }">
		<input type="submit" value="查询">
	</form>
	<table>
		<tr>
			<td>
				<button type="button" onclick="chk(1)">全选</button>
				<button type="button" onclick="chk(2)">全不选</button>
				<button type="button" onclick="chk(3)">反选</button>
			</td>
			<td>编号</td>
			<td>名称</td>
			<td>描述</td>
			<td>作者</td>
			<td>时间</td>
			<td>类别</td>
			<td>操作<input type="button" onclick="add()" value="添加"></td>
		</tr>
		<c:forEach items="${moviea }" var="m">
			<tr>
				<td align="center"><input value="${m.mid }" class="ids" type="checkbox"></td>
				<td>${m.mid }</td>
				<td>${m.mname }</td>
				<td>${m.miao }</td>
				<td>${m.voter }</td>
				<td>${m.datea }</td>
				<td>${m.snames }</td>
				<td><button type="button" onclick="del(${m.mid })">删除</button></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="9" align="center">
				${fenye }
			</td>
		</tr>
	</table></h3>
</center>
</body>
</html>