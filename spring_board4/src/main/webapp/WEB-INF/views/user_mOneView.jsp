<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>user_m One List</title>
</head>
<body>
 <table border="1">
 	<tr>
 		<td>회원 번호</td>
 		<td>회원 이름</td>
 		<td>회원 연락처</td>
 		<td>회원 주소</td> 		
 		<td>회원 나이</td>	
 		<td>회원 성별</td>	
 		<td>회원 등록일</td>	
 	</tr>
 	
	 	 <tr>
	 		<td>${dto.mno}</td>
	 		<td>${dto.mname}</td>
	 		<td>${dto.mphone}</td>
	 		<td>${dto.maddr}</td>
	 		<td>${dto.mage}</td>
	 		<td>${dto.mgender}</td>
	 		<td>${dto.mregdate}</td>
	 	</tr>
 </table>
 
 <a href="user_mUpdateForm?mno=${dto.mno}">수정하기</a> <br>
 
 <a href="user_mDelete?mno=${dto.mno}">삭제하기</a> <br>
</body>
</html>
