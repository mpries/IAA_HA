<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Create Book</title>
</head>
<body>
	<s:head />
	<s:actionerror/>
	<s:form action="addExistingPublicationAdd">


		<s:select label="Publications" list="publications" name="id"
			listKey="id" listValue="id+'-'+title" />

		<s:textfield name="amount" label="Amount"></s:textfield>
		<s:submit value="Add" />

	</s:form>


	<form action="homepage.jsp">
		<s:submit value="Back" />
	</form>
</body>
</html>
