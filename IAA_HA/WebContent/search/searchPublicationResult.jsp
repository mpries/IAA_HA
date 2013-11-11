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
	<s:form action="">
		<table>

			<!-- <tr>
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
		</tr>-->
			<tr>
				<th>Titel</th>
				<th>ISBN</th>
				<th>Autoren</th>
			</tr>

			<s:iterator value="publication">
				<tr>
					<td><s:property value="title" /></td>
					<td><s:property value="ISBN" /></td>
					
				</tr>
			</s:iterator>
		</table>
	
</body>
</html>