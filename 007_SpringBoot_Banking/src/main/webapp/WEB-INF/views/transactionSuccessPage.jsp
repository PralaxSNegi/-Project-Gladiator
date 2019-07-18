<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="spring-form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Transaction Successful</h1>
	<hr>
	<a href="${pageContext.request.contextPath }/home"> Home Page</a>
	<hr>
	<c:if test="${!empty transactionList}">
		<table border="1">
			<tr>
				<th>Reference Id:</th>
				<th>Mode:</th>
				<th>Paid To Account:</th>
				<th>Amount:</th>
				<th>From Account</th>
				<th>On:</th>
				<th>Remarks:</th>
			</tr>
			<c:forEach items="${transactionList}" var="transaction">
				<tr>
					<td>${transaction.transactionId}</td>
					<td>${transaction.mode}</td>
					<td>${transaction.toAccount }</td>
					<td>${transaction.amount }</td>
					<td>${transaction.fromAccount}</td>
					<td>${transaction.tansactionDate }</td>
					<td>${transaction.remark }</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>