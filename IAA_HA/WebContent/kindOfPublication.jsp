<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Kind of Publication</title>
</head>
<body>
	<s:form action="createPublishedPublicationSupply">
		<s:submit key="createPublishedPublicationButton" />
	</s:form>
	<s:form action="createAcademicPublicationSupply">
		<s:submit key="createAcademicPublicationButton" />
	</s:form>
	<s:form action="addExistingPublicationSupply">
		<s:submit key="addExistingButton" />
	</s:form>
	<s:form action="backAction">
		<s:submit key="backButton" />
	</s:form>
</body>
</html>