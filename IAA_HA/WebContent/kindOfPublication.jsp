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
	<s:form action="/academic/createAPublication.jsp"><s:submit value="Create Academic Publication"/></s:form>
	<s:form action="createPublication.jsp"><s:submit value="Create Published Publication"/></s:form>
</body>
</html>