<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>user_m Insert</title>
</head>
<body>

	<form action="/user_mInsert" method="post">
	
		<table>
		
			<tr> 
				<td>회원 이름</td>	
				<td><input type="text" name="mname"></td>	
			</tr>
			
			<tr>
				<td>회원 연락처</td>	
				<td><input type="number" name="mphone"></td>	
			</tr>
			
			<tr>
				<td>회원 주소</td>	
				<td><input type="text" name="maddr"></td>	
			</tr>
			
			<tr>
				<td>회원 나이</td>	
				<td><input type="number" name="mage"></td>	
			</tr>
			
			<tr>
				<td>회원 성별</td>	
				<td>남자 : <input type="radio" name="mgender" value="man"> 여자 : <input type="radio" name="mgender" value="woman"></td>	
			</tr>

		</table>
	
			<input type="submit" value="저장하기">
			
	</form>

</body>
</html>
