<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Edit Customer</title>
</head>
<h1>
	<s:text name="headingHomepage" />
</h1>
<body>
	<s:head />
	<s:form action="editCustomerAction">
		<s:hidden name="customer.customerId" />
		<s:textfield name="customer.firstName" key="firstname" />
		<s:textfield key="lastname" name="customer.lastName" />
		<s:submit key="saveButton" />
		<s:submit key="deleteButton" action="deleteCustomerAction" />
	</s:form>
	<s:form action="backAction">
		<s:submit key="backButton" />
	</s:form>
</body>
</html>