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
	<s:head />
	<s:form action="createAcademicPublicationSave">
		<table>

			<tr>
				<td><s:textfield label="Titel" name="publication.title" /> <s:textfield
						label="Release Date" name="publication.releaseDate" /> <s:textfield
						label="Publisher" name="publication.publisher" />
				<td><s:select label="Keywords" list="keywords"
						name="description" listKey="description" multiple="true"
						listValue="description" /></td>


				<td><s:select label="Authors" list="authors" name="name"
						listKey="name" multiple="true" listValue="name" /></td>



			</tr>
			<tr>

				<td><s:select label="Kind of Publications"
						list="kindOfPublications" name="kind" listKey="kind"
						listValue="kind" /></td>
				<td><s:submit value="Save" /></td>

			</tr>



		</table>
	</s:form>


	<form action="homepage.jsp">
		<s:submit value="Back" />
	</form>
</body>
</html>
