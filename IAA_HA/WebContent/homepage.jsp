<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>Nordakademie Bib-System</h1>
<body>

	<table>
		<tr>
			<th><s:form action="createPublication.jsp">
					<s:submit value="Create Publikation" />
				</s:form></th>
			<th><s:form action="searchPublication.jsp">
					<s:submit value="Search Publication" />
				</s:form></th>
			<th><s:form action="coreDataAdministration.jsp">
					<s:submit value="Core Data Administrator" />
				</s:form></th>
			<th><s:form action="createBookOnLoan.jsp">
					<s:submit value="Create Book on loan" />
				</s:form></th>
			<th><s:form action="bookOnLoanOverview.jsp">
					<s:submit value="Book on loan Overview" />
				</s:form></th>
		</tr>
	</table>
	<h4 style="color: red">Books on loan remainder</h4>
	
		<table style="border:1px solid #FF0000;">
			<tr>
				<th>Author</th>
				<th>Title</th>
				<th>Name</th>
				<th>Status</th>
				<th>Date</th>
			</tr>
			<tr>
				<th>Schroeder</th>
				<th>IT Orga</th>
				<th>Klaus Kleber</th>
				<th>2</th>
				<th>03.05.2013</th>
			</tr>
			<tr>
				<th>Zimmermann</th>
				<th>Mathe ist ein Arsch</th>
				<th>Kai Karsten</th>
				<th>1</th>
				<th>15.07.2013</th>
			</tr>
		</table>
	
</body>
</html>

