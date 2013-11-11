<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>Search Publication Result</h1>
<body>
	<table>
		<s:form action="">
			<tr>
				<s:textfield label="Title" name="" />
			</tr>
			<tr>
				<s:textfield label="ISBN" name="" />
			</tr>
			<tr>
				<s:textfield label="Author" name="" />
			</tr>
			<tr>
				<s:textfield label="KeyWords" name="" />
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
	
	
		<table style="border:2px solid ;">
			<tr>
				<th>Author</th>
				<th>Title</th>
				<th>Name</th>
				<th>Date</th>
			</tr>
			<tr>
				<th>Schroeder</th>
				<th>IT Orga</th>
				<th>Klaus Kleber</th>
				<th>03.05.2013</th>
			</tr>
			<tr>
				<th>Zimmermann</th>
				<th>Mathe ist ein Arsch</th>
				<th>Kai Karsten</th>
				<th>15.07.2013</th>
			</tr>
		</table>

</body>
</html>