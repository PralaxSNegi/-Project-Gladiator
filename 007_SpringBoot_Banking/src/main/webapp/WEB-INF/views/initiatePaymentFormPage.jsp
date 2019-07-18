
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Initiate Payment</title>
<style>
h1 {
	border-style: solid;
	border-color: black;
	font-weight: bold;
}

.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
	<h1>Initiate Payment</h1>
	<hr>
	<!--  <a href="${pageContext.request.contextPath }/home"> Home Page</a>-->
	<hr>
   <c:url var="myaction"
		value="/initiatePayment/showTransactionList"></c:url> 
	<form:form action="${myaction}" method="post"
		modelAttribute="initiatePayment">
		<table>
		<%-- 	<tr>
					<td><form:label path="transactionId"></form:label></td>
					<td><form:input path="transactionId" readonly="true"
							size="8" disabled="true" /> 
							<form:hidden path="transactionId" /></td>
				</tr> --%>
				<%-- <tr>
				<td>Transaction Id:</td>
				<td><form:input path="transactionId" /></td>
				<td><form:errors path="transactionId" cssClass="error" /></td>
			</tr> --%>
			
			<tr>
				<td>From Account:</td>
				<td><form:input path="fromAccount" /></td>
				<td><form:errors path="fromAccount" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td>To Account:</td>
				<td><form:input path="toAccount" /></td>
				<td><form:errors path="toAccount" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Amount:</td>
				<td><form:input path="amount" /></td>
				<td><form:errors path="amount" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Transaction Date:</td>
				<td><form:input path="tansactionDate" placeholder="MM/dd/yyyy" /></td>
				<td><form:errors path="tansactionDate" cssClass="error" /></td>
			</tr>
			<tr>
				<td>IFSC Code:</td>
				<td><form:input path="ifscCode" /></td>
				<td><form:errors path="ifscCode" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Name Of Bank:</td>
				<td><form:input path="nameOfBank" /></td>
				<td><form:errors path="nameOfBank" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:radiobutton path="mode" value="NEFT" />NEFT</td>
				<td><form:radiobutton path="mode" value="RTGS" />RTGS</td>
				<td><form:radiobutton path="mode" value="IMPS" />IMPS</td>
			</tr>
			<tr>
				<td>Remark:</td>
				<td><form:input path="remark" /></td>
				<td><form:errors path="remark" cssClass="error" /></td>
			</tr>
		</table>
		<p>Please Note:</p>
		<p>1. Transactions will be executed on the next working day if
			they are scheduled for Sunday, National Holidays (as declared by
			RBI).</p>
		<p>2. Timings for NEFT: Monday-Saturday (except 2nd and 4th
			Saturday) 6:00 AM to 6:30 PM.</p>
		<tr>
			<input type="submit" value="Submit" />
		</tr>
	</form:form>
</body>
</html>