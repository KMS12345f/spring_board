<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>user_m update</title>
</head>
<body>
<form action="/user_mUpdate" method="post">

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
	 		<td><input type="text" name="mno" value="${dto.mno}" readonly="readonly"></td>
	 		<td><input type="text" name="mname" value="${dto.mname}"></td>
	 		<td><input type="text" name="mphone" value="${dto.mphone}"></td>
	 		<td><input type="text" name="maddr" value="${dto.maddr}"></td>
	 		<td><input type="number" name="mage" value="${dto.mage}"></td>
	 		<td>  <c:if test="${dto.mgender == 'woman'}">
		      남 : <input type="radio" name="mgender" value="man">
		      여 : <input type="radio" name="mgender" value="woman" checked="checked">
		      </c:if>
		      <c:if test="${dto.mgender == 'man'}">
		      남 : <input type="radio" name="mgender" value="man" checked="checked">
		      여 : <input type="radio" name="mgender" value="woman">
		      </c:if>
		     </td>
	 		<td><input type="text" value="${dto.mregdate}" readonly="readonly"></td>
	 	</tr>
 </table>
 
 	<input type="submit" value="수정하기">
 	
 
 </form>
</body>
</html>
