<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
  시작 페이지 입니다. <br>
  <table border="1">
  	<tr>
  		<td><a href="/register">게시글 입력 바로가기</a></td>
  		<td><a href="/boardList">게시글 리스트 바로가기</a></td>
  	</tr>
  	
  	<tr>
  		<td><a href="/user_mForm">회원 입력 바로가기</a></td>
  		<td><a href="/user_mList">회원 리스트 바로가기</a></td>
  	</tr>
  	
  	<tr>
  		<td><a href="/uploadForm">파일 업로드 바로가기</a></td>
  		<td><a href="/uploadAjax">파일 업로드2 바로가기</a></td>
  	</tr>
  </table>
</body>
</html>
