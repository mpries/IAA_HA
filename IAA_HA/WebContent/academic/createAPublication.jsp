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
				<td><s:textfield key="titel" name="publication.title" /> <s:textfield
						key="releaseDate" name="publication.releaseDate" /> <s:textfield
						key="Publisher" name="publication.publisher" />
				<td><s:select key="keywords" list="keywords" name="description"
						listKey="description" multiple="true" listValue="description" /></td>


				<td><s:select key="authors" list="authors" name="name"
						listKey="name" multiple="true" listValue="name" /></td>



			</tr>
			<tr>

				<td><s:select key="kindOfPublication" list="kindOfPublications"
						name="kind" listKey="kind" listValue="kind" /></td>
				<td><s:submit key="saveButton" /></td>

			</tr>



		</table>
	</s:form>


	<s:form action="backAction">
		<s:submit key="backButton" />
	</s:form>
</body>
</html>
