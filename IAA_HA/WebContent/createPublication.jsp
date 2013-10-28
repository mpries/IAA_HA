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
	<table>
		<s:form action="PublicationCreateAction">
			<tr>
				<s:textfield label="Kind of Publication" key="title" />	<!-- @TODO Dropdown Menu mit den 3 Moeglichkeiten -->
			</tr>
			<tr>
				<s:textfield label="Title" key="title" />
			</tr>
			<tr>
				<s:textfield label="Author" key="author" />
			</tr>
			<tr>
				<s:textfield label="Publication Key" key="login.UserName" />
			</tr>
			<tr>
				<s:textfield label="Releas Date" key="login.UserName" />
			</tr>
			<tr>
				<s:textfield label="Kind" key="login.UserName" />
			</tr>
			<tr>
				<s:textfield label="ISBN" key="login.UserName" />
			</tr>
			<tr>
				<s:textfield label="KeyWords" key="login.UserName" />
			</tr>
			<tr>
				<s:textfield label="Publisher" key="login.UserName" />
			</tr>
		</s:form>

		<tr>
			<th><s:form action="PublicationCreateAction">
					<s:submit value="Create" />
				</s:form></th>
		</tr>
		<tr>
			<th><s:form action="homepage.jsp">
					<s:submit value="Back" />
				</s:form></th>
		</tr>

	</table>


</body>
</html>