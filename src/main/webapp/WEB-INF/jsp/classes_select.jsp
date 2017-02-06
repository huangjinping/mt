<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="common.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示所有的数据</title>
</head>

<script type="text/javascript">
   function Modeclick(){
	   console.log("Hello World");
	   $.getJSON("http://localhost:8080/mt/getLoginJson",
			   function(data){
		   
		   		console.log(data);
			    /*  $.each(data.items, function(i,item){
			       $("<img/>").attr("src", item.media.m).appendTo("#images");
			       
			       con
			       if ( i == 3 ) return false;
			       
			       
			     }); */
			     
			     
			   }); 
	   
   }
</script>
<body>

   <form action="#">
     <P>这是提交的数据</P>
   	  <input type="button" onclick="Modeclick()" value="提交数据">
   </form>
    <img alt="" src=""  width="100" height="100">

	<table>
		<tr>
			<td>id</td>
			<td>名字</td>
			<td>class_id</td>
		</tr>
		<c:forEach items="${list}" var="student">
		<tr>
		  <td><c:out value="${student.s_id}"></c:out></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>