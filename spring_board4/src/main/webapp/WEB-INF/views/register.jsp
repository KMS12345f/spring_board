<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Insert home</title>
</head>
<body>

	<form action="/register" method="post">
	
		<table>
		
			<tr>
				<td>제목</td>	
				<td><input type="text" name="btitle"></td>	
			</tr>
			
			<tr>
				<td>내용</td>	
				<td><input type="text" name="bcontent"></td>	
			</tr>
			
			<tr>
				<td>작성자</td>	
				<td><input type="text" name="bwriter"></td>	
			</tr>
		
		</table>
	
			<input type="submit" value="저장하기">
			
	</form>

</body>
</html>
