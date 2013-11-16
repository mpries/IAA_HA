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

	<s:form action="addExistingPublicationAdd">
		<s:head />

		<s:select label="Publications" list="publications" name="id"
			listKey="id" listValue="id+'-'+title" />

		<s:fielderror fieldName="test" />
		<s:textfield name="amount" label="Amount" />
		<s:submit value="Add" />

	</s:form>


	<s:form action="backAction">
		<s:submit value="Back" />
	</s:form>
</body>
</html>
