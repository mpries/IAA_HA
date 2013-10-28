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
				<s:textfield label="Title" name="login.UserName" />
			</tr>
			<tr>
				<s:textfield label="Author" name="login.UserName" />
			</tr>
			<tr>
				<s:textfield label="Publication Key" name="login.UserName" />
			</tr>
			<tr>
				<s:textfield label="Releas Date" name="login.UserName" />
			</tr>
			<tr>
				<s:textfield label="Kind" name="login.UserName" />
			</tr>
			<tr>
				<s:textfield label="ISBN" name="login.UserName" />
			</tr>
			<tr>
				<s:textfield label="KeyWords" name="login.UserName" />
			</tr>
			<tr>
				<s:textfield label="Publisher" name="login.UserName" />
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