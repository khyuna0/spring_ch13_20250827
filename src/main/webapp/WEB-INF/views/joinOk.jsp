<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 내역</title>
</head>
<body>
	<h1>회원 가입 내역 화면</h1>
	<hr>
	<h2> 아이디 : ${memberDto.mid }</h2>
	<h2> 비밀번호 : ${memberDto.mpw }</h2>
	<h2> 이름 : ${memberDto.mname }</h2>
	<h2> 나이 : ${memberDto.mage }</h2>
</body>
</html>