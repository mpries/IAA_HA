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
	<s:form action="passToCreatePublcationAction">
		<s:select name="KindOfPublication" multiple="false" size="3"
			list="%{@de.nordakademie.model.enumaration.KindOfPublication@values()}"
			label="Kind of Publication" />
		<s:submit value="ok" />
	</s:form>
</body>
</html>