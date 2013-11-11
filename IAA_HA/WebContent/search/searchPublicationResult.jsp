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

	<table border="2ppx">
		<tr>
			<th>Id</th>
			<th>Title</th>
			<th>Stored</th>
			<th>Kind of Publication</th>
			<th>Release Date</th>
			<th>Author</th>
			<th>Keywords</th>

		</tr>
		<s:iterator value="publication">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:url var="url" action="publicationEditAction">
						
					</s:url> <s:a href="%{url}" ><s:hidden value="publication.id" />
						<s:property value="title" />
					</s:a></td>
				<td><s:property value="stored" /></td>
				<td><s:property value="kindOfPublication" /></td>
				<td><s:property value="releaseDate" /></td>
				<td><s:iterator value="authors">
						<s:property value="name" />
					</s:iterator></td>
				<td><s:iterator value="keywords">
						<s:property value="description" />
					</s:iterator></td>

			</tr>
		</s:iterator>
	</table>

</body>
</html>

