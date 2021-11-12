<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Update Page</title>
</head>
<body>

	<form action="/update" method="post">
	
		<table border="1">
			<tr>
		 		<td>번호</td>
		 		<td>제목</td>
		 		<td>작성자</td>
		 		<td>등록일</td>
	 		</tr>
	 		
	 		<tr>
		 		<td><input type="text" name="bno" value="${dto.bno}" readonly="readonly"></td>
		 		<td><input type="text" name="btitle" value="${dto.btitle}"></td>
		 		<td><input type="text" name="bwriter" value="${dto.bwriter}" readonly="readonly"></td>
		 		<td><input type="text" name="bregdate" value="${dto.bregdate}" readonly="readonly"></td>
	 		</tr>
	 		
	 		
	 		<tr>
			 	<td>내용</td>
			 	<td colspan="3"><input type="text" name="bcontent" value="${dto.bcontent}"></td>
			</tr>
		
		</table>
	
			<input type="submit" value="수정하기">
			
	</form>

</body>
</html>
