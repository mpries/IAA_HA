<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
	<s:form action="publicationEditActionsave">
		<s:hidden name="publication.id"/>
		<s:textfield name="publication.title" label="Title" />
		<s:textfield name="publication.kindOfPublication"
			label="Kind of Publication" />
		<s:textfield name="publication.releaseDate" label="Release Date" />


		<s:iterator value="publication.authors">
			<s:textfield name="name" label="Author" readonly="true" />
			<br>
		</s:iterator>
		<s:iterator value="publication.keywords">
			<s:textfield name="description" label="Keyword" readonly="true"/>
			<br>
		</s:iterator>


		<s:submit value="Cancel" action="/homepage.jsp" />

		<s:submit value="Save" />
	</s:form>


	<s:form action="publicationEditActiondelete">
		<s:param name="publication" value="publication"></s:param>
		<s:submit value="Delete" />
	</s:form>




</body>
</html>