<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>Core Data Administration</h1>
<body>
	<s:head />
	<table border="1pxx">
		<tr>
			<th>Customer Data Editor</th>
			<th>Keywords Administration
			<th>Author Administration</th>
			<th>Kind of Publication</th>
		</tr>
		<tr>
			<td><s:form action="searchCustomerAction">

					<s:textfield label="ID" key="id" />
					<s:submit value="Search" />
				</s:form></td>



			<td><s:form action="keyword_search">
					<s:textfield label="Search" name="searchKeyword" />
					<s:submit value="Search" />
				</s:form> <s:form action="keyword_save">
					<s:textfield label="Result" name="resultKeyword.description"
						readonly="true" />
					<s:textfield label="Edit" name="editKeyword" ></s:textfield>
					<s:submit value="Save" />
				</s:form> <s:form action="keyword_delete">
					<s:hidden name="resultKeyword.description" />
					<s:submit value="Delete" />
				</s:form></td>



			<td><s:form action="author_search">
					<s:textfield label="Search" name="searchAuthor" />
					<s:submit value="Search" />
				</s:form> <s:form action="author_save">
					<s:textfield label="Result" name="resultAuthor.name"
						readonly="true" />
					<s:textfield label="Edit" name="editAuthor"></s:textfield>
					<s:submit value="Save" />
				</s:form> <s:form action="author_delete">
					<s:hidden name="resultAuthor.name" />
					<s:submit value="Delete" />
				</s:form></td>


			<td><s:form action="kindOfPublication_search">
					<s:textfield label="Search" name="searchKind" />
					<s:submit value="Search" />
				</s:form> <s:form action="kindOfPublication_save">
					<s:textfield label="Result" name="resultKind.kind" readonly="true" />
					<s:textfield label="Edit" name="editKind"></s:textfield>
					<s:submit value="Save" />
				</s:form> <s:form action="kindOfPublication_delete">
					<s:hidden name="resultKindOfPublication.kind" />
					<s:submit value="Delete" />
				</s:form></td>
		<tr>
		<tr>

			<td>EMPTY</td>

			<td><s:form action="keyword_add">
					<s:textfield name="addKeyword" label="Add Keyword" value="" />
					<s:submit value="Add" />
				</s:form></td>

			<td><s:form action="author_add">
					<s:textfield name="addAuthor" label="Add Author" value="" />
					<s:submit value="Add" />
				</s:form></td>

			<td><s:form action="kindOfPublication_add">
					<s:textfield name="addKind" label="Add Kind" value="" />
					<s:submit value="Add" />
				</s:form></td>

		</tr>
	</table>
	<s:form action="backAction">
		<s:submit value="Back" />
	</s:form>
</body>
</html>
