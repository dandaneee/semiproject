<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 내용입니다</title>
</head>
<body>
		<table border="1">
		<tr>
			<th>작성자</th>
			<td>${vo.bd_name }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${vo.bd_title }</td>
			</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="10" cols="60" readonly="readonly" > ${vo.bd_content }</textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
					<input type="button" value="수정" onclick="location.href='update.do?bd_no=${vo.bd_no}' ">
					<input type="button" value="삭제" onclick="location.href='delete.do?bd_no=${vo.bd_no}' ">
					<input type="button" value="목록" onclick="location.href='list.do' ">
			</td>
		</tr>	
		</table>


</body>
</html>