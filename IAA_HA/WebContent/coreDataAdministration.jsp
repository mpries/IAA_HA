<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>
	<s:text name="headingCoreDataAdministration" />
</h1>
<body>
	<s:head />
	<table border="1pxx">
		<tr>
			<th><s:text name="customerDataEditor" /></th>
			<th><s:text name="keywordAdministration" /></th>

			<th><s:text name="authorAdministration" /></th>
			<th><s:text name="kindOfPublication" /></th>
		</tr>
		<tr>
			<td><s:form action="searchCustomerAction">

					<s:textfield label="ID" key="id" />
					<s:submit key="searchButton" />
				</s:form></td>



			<td><s:form action="keyword_search">
					<s:textfield key="search" name="searchKeyword" />
					<s:submit key="searchButton" />
				</s:form> <s:form action="keyword_save">
					<s:textfield key="result" name="resultKeyword.description"
						readonly="true" />
					<s:textfield key="edit" name="editKeyword"></s:textfield>
					<s:submit key="saveButton" />
				</s:form> <s:form action="keyword_delete">
					<s:hidden name="resultKeyword.description" />
					<s:submit key="deleteButton" />
				</s:form></td>



			<td><s:form action="author_search">
					<s:textfield key="search" name="searchAuthor" />
					<s:submit key="searchButton" />
				</s:form> <s:form action="author_save">
					<s:textfield key="result" name="resultAuthor.name" readonly="true" />
					<s:textfield key="edit" name="editAuthor"></s:textfield>
					<s:submit key="saveButton" />
				</s:form> <s:form action="author_delete">
					<s:hidden name="resultAuthor.name" />
					<s:submit key="deleteButton" />
				</s:form></td>


			<td><s:form action="kindOfPublication_search">
					<s:textfield key="search" name="searchKind" />
					<s:submit key="searchButton" />
				</s:form> <s:form action="kindOfPublication_save">
					<s:textfield key="result" name="resultKind.kind" readonly="true" />
					<s:textfield key="edit" name="editKind"></s:textfield>
					<s:submit key="saveButton" />
				</s:form> <s:form action="kindOfPublication_delete">
					<s:hidden name="resultKindOfPublication.kind" />
					<s:submit key="deleteButton" />
				</s:form></td>
		<tr>
		<tr>

			<td />

			<td><s:form action="keyword_add">
					<s:textfield name="addKeyword" key="addKeyword" value="" />
					<s:submit key="addButton" />
				</s:form></td>

			<td><s:form action="author_add">
					<s:textfield name="addAuthor" key="addAuthor" value="" />
					<s:submit key="addButton" />
				</s:form></td>

			<td><s:form action="kindOfPublication_add">
					<s:textfield name="addKind" key="addKindOfPublication" value="" />
					<s:submit key="addButton" />
				</s:form></td>

		</tr>
	</table>
	<s:form action="backAction">
		<s:submit key="backButton" />
	</s:form>
</body>
</html>
