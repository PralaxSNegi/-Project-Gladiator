
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session Expired </title>
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
	<h1>You have been logged out</h1>
		     <table>
		     <tr>
		     <td>
		     <p> Session Expired </p>
		     </td>
		     <td>
			<p> Last Logged In:</p>
			</td>
			</tr>
		     </table>
		     <a href="${pageContext.request.contextPath }/home"> Click here to go to login page</a>

</body>
</html>