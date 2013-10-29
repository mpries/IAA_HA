<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>Create Publication</h1>
<body>
	<s:head />
	<table>
		<s:form action="publicationCreateAction">
			<tr>
				<s:textfield label="Title" key="title" />
			</tr>
			<tr>
				<s:textfield label="Author" key="author" />
			</tr>
			<tr>
				<s:textfield label="Releas Date" key="releaseDate" />
			</tr>
			<tr>
				<s:textfield label="ISBN" key="isbn" />
			</tr>
			<tr>
				<s:textfield label="Keywords (seperate with commas)" key="keywords" />
			</tr>
			<tr>
				<s:textfield label="Publisher" key="publisher" />
			</tr>
			<tr>
				<s:select name="KindOfPublication" multiple="false" size="3"
					list="%{@de.nordakademie.model.enumaration.KindOfPublication@values()}"
					label="Kind of Publication" />
			</tr>
			<tr>
				<th><s:submit value="Create" /></th>
			</tr>

		</s:form>

	</table>

	<form action="homepage.jsp">
		<s:submit value="Back" />
	</form>


</body>
</html>