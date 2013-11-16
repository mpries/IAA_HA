<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1><s:text name="createBookOnLoan" /></h1>
<body>
	<s:head />

	<s:form action="lendActioncreate">
		<s:textfield key="loanDate" name="currentDate" readonly="true" />
		<s:textfield key="returnDate" name="returnDate" readonly="true" />


		<s:select key="customer" headerValue="Select Customer"
			list="customers" name="customerId" listKey="customerId"
			listValue="firstName+'-'+lastName+'-'+customerId" />


		<s:select key="publications" list="publications" name="id"
			listKey="id" listValue="title+'-'+kindOfPublication.kind+'-'+id" />


		<s:submit key="createButton" />
	</s:form>
	<s:form action="backAction">
		<s:submit key="backButton" />
	</s:form>
</body>
</html>
