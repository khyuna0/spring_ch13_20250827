<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h1>회원가입</h1>
	<hr>
	<h3>get</h3>
	<form action="joinOk" method="get">
		아이디 : <input type="text" name="mid"> <br><br> 
		비밀번호 : <input type="password" name="mpw"> <br><br>
		이름 : <input type="text" name="mname"> <br><br>
		나이 : <input type="text" name="mage"> <br><br>
		<input type="submit" value="회원가입">
	</form>
	
	<hr>
	<h3>post</h3>
	<form action="joinOk" method="post">
		아이디 : <input type="text" name="mid"> <br><br> 
		비밀번호 : <input type="password" name="mpw"> <br><br>
		이름 : <input type="text" name="mname"> <br><br>
		나이 : <input type="text" name="mage"> <br><br>
		<input type="submit" value="회원가입">
	</form>
</body>
</html>