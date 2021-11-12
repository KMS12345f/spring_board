<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>user_m List</title>
</head>
<body>
 <table border="1">
 	<tr>
 		<td>회원 번호</td>
 		<td>회원 이름</td>
 		<td>회원 등록 일자</td>
 	</tr>
 	
  	<c:forEach var="user_mList" items="${user_mList}">
	 	 <tr>
	 		<td>${user_mList.mno}</td>
	 		<td><a href="user_mOneList?mno=${user_mList.mno}">${user_mList.mname}</a></td>
	 		<td>${user_mList.mregdate}</td>
	 	</tr>
 	</c:forEach>
 	
 </table>
</body>
</html>
