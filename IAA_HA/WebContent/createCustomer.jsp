<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>
	<s:text name="headingcreateCustomer" />
</h1>
<body>
	<s:head />
	<table>
		<s:form action="customerCreateAction">
			<tr>
				<s:textfield key="firstname" name="customer.firstName" />
			</tr>
			<tr>
				<s:textfield key="lastname" name="customer.lastName" />
			</tr>
			<tr>
				<s:textfield key="id" name="customer.customerId" />
			</tr>
			<tr>
				<th><s:submit key="createButton" /></th>
			</tr>

		</s:form>

	</table>

	<s:form action="backAction">
		<s:submit key="backButton" />
	</s:form>


</body>
</html>