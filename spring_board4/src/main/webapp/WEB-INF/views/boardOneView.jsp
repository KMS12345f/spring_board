<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Board One List</title>
</head>
<body>
 <table border="1">
 	<tr>
 		<td>번호</td>
 		<td>제목</td>
 		<td>작성자</td>
 		<td>등록일</td>
 	</tr>
 	

	<tr>
	 	<td>${dto.bno}</td>
	 	<td>${dto.btitle}</td>
	 	<td>${dto.bwriter}</td>
	 	<td>${dto.bregdate}</td>
	</tr>
	 	
	<tr>
	 	<td>내용</td>
	 	<td colspan="3">${dto.bcontent}</td>
	</tr>
 	
 </table>
 
 <a href="/updateForm?bno=${dto.bno}">수정하기</a> <br>
 
 <a href="/delete?bno=${dto.bno}">삭제하기</a> <br>


</body>
</html>
