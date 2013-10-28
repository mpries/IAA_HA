<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>Create book on loan</h1>
<body>

	<table align="left">
		<tr>
			<s:form action="SearchAction">
				<tr>
					<s:textfield label="Title" name="login.UserName" />
				</tr>
				<tr>
					<s:textfield label="ISBN" name="login.UserName" />
				</tr>
				<tr>
					<s:textfield label="Author" name="login.UserName" />
				</tr>
				<tr>
					<s:textfield label="KeyWords" name="login.UserName" />
				</tr>
			</s:form>
		<tr>
			<th><s:form action="SearchPublikation">
					<s:submit value="Search" />
				</s:form></th>
		</tr>
		<tr>
			<th><s:form action="homepage.jsp">
					<s:submit value="Back" />
				</s:form></th>

		</tr>
	</table>


	<table border="1">
		<tr>
			<th>Author</th>
			<th>Title</th>
			<th>Name</th>
			<th>Status</th>
			<th>Date</th>
			<th>Select</th>
		</tr>
		<tr>
			<th>Schroeder</th>
			<th>IT Orga</th>
			<th>Klaus Kleber</th>
			<th>2</th>
			<th>03.05.2013</th>
			<th>#</th>
		</tr>
		<tr>
			<th>Zimmermann</th>
			<th>Mathe ist ein Arsch</th>
			<th>Kai Karsten</th>
			<th>1</th>
			<th>15.07.2013</th>
			<th>#</th>
		</tr>

	</table>
	<table>
		<tr>
			<th><h3>Customer Data Editor</h3></th>
			<th><s:textfield label="Matrikel No." name="login.UserName" /></th>
			<th><s:form action="SearchAction">
					<s:submit value="ORDER" />
				</s:form></th>
		</tr>
	</table>

</body>
</html>