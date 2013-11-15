<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>Create book on loan</h1>
<body>
<s:head/>

	<s:form action="lendActioncreate">
		<s:textfield label="Datum der Ausgabe" name="currentDate"
			readonly="true" />
		<s:textfield label="Rueckgabedatum" name="returnDate" readonly="true" />


		<s:select label="Customer" 
			headerValue="Select Customer" list="customers" name="customerId" listKey="customerId"
			listValue="firstName+'-'+lastName+'-'+customerId" />


		<s:select label="Publications" 
			list="publications" name="id" listKey="id"
			listValue="title+'-'+kindOfPublication.kind+'-'+id" />


		<s:submit value="Create" />
	</s:form>

	<s:form action="homepage.jsp">
		<s:submit value="Back" />
	</s:form>

</body>
</html>