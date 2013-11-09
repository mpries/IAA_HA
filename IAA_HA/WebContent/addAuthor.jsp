<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Add Author</title>
</head>
<body>
	<s:form action="publicationCreateActionaddAuthor">
		<s:textfield name="author.firstName" value="" label="Author"/>
		<s:textfield name="author.lastName" value="" label="Author"/>
		<s:submit value="Add"/>
	</s:form>
	<s:form action="publicationCreateActionsaveAuthor"><s:submit value="Done"/></s:form>
</body>
</html>