<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Create Book</title>
</head>
<body>
	<table>
		<s:form action="aPublicationCreateActionexecute">
			<tr>
				<s:textfield label="Title" name="publication.title" />
			</tr>
			<tr>
				<s:textfield label="Release Date" name="publication.releaseDate"/>
			</tr>
			<tr>
				<s:textfield label="Publisher" name="publication.publisher.name" />
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
