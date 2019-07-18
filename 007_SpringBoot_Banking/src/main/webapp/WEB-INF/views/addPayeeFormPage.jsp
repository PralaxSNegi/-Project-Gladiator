<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Payee</title>
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
	<h1>Add Payee</h1>
	<hr>
	<!--  <a href="${pageContext.request.contextPath }/home"> Home Page</a>-->
	<hr>
	<c:url var="myaction"
		value="/initiatePayment/savePayee"></c:url>
	<form:form action="${myaction}" method="post" modelAttribute="addPayee">
		<table>
			<%-- 	<tr>
					<td><form:label path="beneficiaryId"></form:label></td>
					<td><form:input path="beneficiaryId" readonly="true"
							size="8" disabled="true" /> 
							<form:hidden path="beneficiaryId" /></td>
				</tr> --%>
			<%-- <tr>
				<td>Beneficiary Id:</td>
				<td><form:input path="beneficiaryId" /></td>
				<td><form:errors path="beneficiaryId" cssClass="error" /></td>
			</tr> --%>

			<tr>
				<td>Beneficiary Name:</td>
				<td><form:input path="beneficiaryName" /></td>
				<td><form:errors path="beneficiaryName" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Beneficiary Account Number:</td>
				<td><form:input path="beneficiaryAccountNumber" /></td>
				<td><form:errors path="beneficiaryAccountNumber"
						cssClass="error" /></td>
			</tr>
			<tr>
				<td>IFSC Code:</td>
				<td><form:input path="beneficiaryIfscCode" /></td>
				<td><form:errors path="beneficiaryIfscCode" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Name Of Bank:</td>
				<td><form:input path="beneficiaryNameOfBank" /></td>
				<td><form:errors path="beneficiaryNameOfBank" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Nick Name:</td>
				<td><form:input path="beneficiaryNickName" /></td>
				<td><form:errors path="beneficiaryNickName" cssClass="error" /></td>
			</tr>
			<tr>
				<input type="submit" value="Submit" />
			</tr>
		</table>
	</form:form>
</body>
</html>