<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면입니다.</title>
</head>
<body>
	<h1> 로그인</h1>
	<form action="userlogin.do" method="post">
	<input type="hidden" value="login">
	<table boarder="1">
		<col width="100" > <col width="100">
		<tr>
			<th>아이디 </th>
			<td><input type="text" name="bm_id"></td>
		</tr>
		<tr> 
			<th>비밀번호 </th>
			<td><input type="password" name="bm_pw"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="로그인">
				<input type="button" value="회원가입" onclick="location.href='register.do'">
			</td>
		</tr>
	</table>
	
	</form>

</body>
</html>