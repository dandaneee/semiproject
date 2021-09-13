<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새글쓰기 화면</title>
</head>
<body>
	<form action="bdinsert.do" method="post">
	<table border="1">
	<tr>
		<th> 이름 </th>
		<td> <input type="text" name="bd_name" ></td>
	</tr>
	<tr>
		<th> 제목 </th>
		<td> <input type="text" name="bd_title" ></td>
	</tr>
	<tr>
		<th> 내용 </th>
		<td> <textarea rows="10" cols="60" name="bd_content" ></textarea></td>
	</tr>	
	<tr>
		<td colspan="2" align="right">
			<input type="submit" value="올리기">
			<input type="button" value="목록으로" onclick="location.href='list.do'">
		</td>
	</tr>
	
	</table>
	
	</form>

</body>
</html> 