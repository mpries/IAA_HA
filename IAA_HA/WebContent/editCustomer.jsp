<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Edit Customer</title>
</head>
<h1>Nordakademie Bib-System</h1>
<body>
	<s:head />
	<s:form action="editCustomerAction">
		<s:hidden name="customer.customerId" />
		<s:textfield name="customer.firstName" label="First Name" />
		<s:textfield label="Last Name" name="customer.lastName" />
		<s:submit value="Save" />
		<s:submit value="Delete" action="deleteCustomerAction" />
		<s:form action="homepage.jsp">
			<s:submit value="Back" />
		</s:form>
	</s:form>
</body>
</html>