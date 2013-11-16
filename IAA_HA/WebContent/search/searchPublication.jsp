<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>Search Publication</h1>
<body>
	<table>
		<s:form action="searchPublicationAction">
			<tr>
				<s:textfield label="Title" name="title" />
			</tr>
			<tr>
				<s:textfield label="Author" name="author" />
			</tr>
			<tr>
				<s:textfield label="KeyWords" name="keyword" />
			</tr>
			<tr>
				<s:submit value="Search" />

			</tr>
		</s:form>
		<tr>
			
		</tr>

	</table>


<s:form action="backAction">
				<s:submit value="Back" />
			</s:form>
</body>
</html>