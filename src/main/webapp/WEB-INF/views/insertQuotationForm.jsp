<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("UTF-8");
%>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="${contextPath }/insertQuotation.do">
		<table border="1">
		  <tr>
		    <td>견적번호</td><td><input type="text" name="no"></td>
		  </tr>
		  <tr>
		    <td>요청업체 ID</td><td><input type="text" name="compId" value="userId" readonly/></td><!-- 차 후 userId 부분 request.getSession("userId")로 수정 -->
		  </tr>
		  <tr>
		    <td>견적업체 ID</td><td><input type="text" name="manuId" value="<%= request.getParameter("manuId") %>" readonly/></td>
		  </tr>
		  <tr>
		    <td>견적품목</td><td><input type="text" name="item"/></td>
		  </tr>
		  <tr>
		    <td>견적금액</td><td><input type="text" name="price"></td>
		  </tr>
		  <tr>
		    <td>수량</td><td><input type="text" name="quantity"></td>
		  </tr>
		  <tr>
		    <td>VAT</td><td><input type="text" name="vat"></td>
		  </tr>
		  <tr>
		    <td>견적상세</td><td><input type="text" name="detail"></td>
		  </tr>
		  <tr>
		    <td>견적요청 파일</td><td><input type="text" name="fileName"></td>
		  </tr>
		  <tr>
		    <td>임시저장여부</td><td><input type="text" name="tempSave"></td>
		  </tr>
		  <tr>
			  <td>
			  	<input value="0" name="quoteStatus" type="hidden">
			  </td>
		  </tr>
		  <tr  style="text-align: center;">
		  	<td>
		  		<input type="submit" value="견적요청" />
		  	</td>
		  	
		  	<td>
		  		<input type="reset" value="다시입력" />
		  	</td>
		  </tr>
		</table>
	</form>
</body>
</html>