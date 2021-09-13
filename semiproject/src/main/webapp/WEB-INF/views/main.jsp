<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>


<% request.setCharacterEncoding("UTF-8");%>    
<% response.setContentType("text/html; charset=UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>메인 페이지</title>
<script src="/semiproject/resources/jquery-3.2.1.min.js"></script>
</head>
<body>
   <h1>게시판 목록</h1>
   <h3>${log.bm_name }회원님 안녕하세요!</h3>
   <table border="1">
   <colgroup>
   <col width="50">
   <col width="100">
   <col width="300">
   <col width="100">
   </colgroup>
   <tr>
   <th>NO</th>
   <th>NAME</th>
   <th>TITLE</th>
   <th>DATE</th>
   </tr>
   <c:forEach items="${list }" var="vo">
   <tr>
   			<td>${vo.bd_no }</td>
   			<td>${vo.bd_name }</td>
   			<td><a href="one.do?bd_no=${vo.bd_no }">${vo.bd_title }</td>
   			<td>${vo.bd_date }</td>
   </tr>
   </c:forEach>
   <tr>
   <td colspan="4" align="right">
   <input type="button" value="새글 쓰기" onclick="location.href='insert.do' ">
   <input type="button" value="로그인" onclick="location.href='login.do' ">
    </td>

   </tr>
   </table>
   
</body>
</html>