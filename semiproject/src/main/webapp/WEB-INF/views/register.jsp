<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 화면</title>
</head>
<body>
<h1> 가입화면 입니다.</h1>
<form action="userregister.do" method="post">
<table>
<tr>
	<th>아이디: </th> 
	<td><input type="text" name="bm_id"></td>
</tr>
<tr>
	<th>비밀번호: </th>
 	<td><input type="password" name="bm_pw"> <td>
</tr>
<tr>
	<th>이름: </th> 
	<td><input type="text" name="bm_name"></td>
</tr>
<tr>
	<th>주소: </th> 
	<td> <input type="text" name="bm_addr"> </td>
</tr>
<tr>
	<th> 휴대폰번호: </th> 
	<td><input type="text" name="bm_phone"></td>
</tr>
<tr>
	<th>메일주소: </th> 
	<td><input type="email" name="bm_email"></td>
</tr>
<tr>
	<td colspan="3" align="right">
	<input type="submit" value="가입완료">
	<input type="button" value="목록으로" onclick="location.href='list.do'">
	<input type="button" value="로그인화면으로" onclick="location.href='login.do' ">
	</td>
</tr>
</table>
</form>

</body>
</html>