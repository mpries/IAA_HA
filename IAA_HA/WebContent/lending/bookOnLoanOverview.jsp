<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>Book on loan Overview</h1>
<body>
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

	
	<s:form action="homepage.jsp">
					<s:submit value="Back" />
				</s:form>
		</table>
</body>
</html>