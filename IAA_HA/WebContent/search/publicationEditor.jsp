
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
	<s:head />
	<s:actionerror />
	<s:form action="publicationEditActionsave">
		<s:hidden name="publication.id" />
		<s:textfield name="publication.title" key="title" />
		<s:select key="kindOfPublication" list="kindOfPublications"
			name="kind" listKey="kind" listValue="kind" />
		<s:textfield name="publication.releaseDate" key="releaseDate" readonly="true"/>


		<s:iterator value="publication.authors">
			<s:textfield name="name" key="author" readonly="true" />
			<br>
		</s:iterator>
		<s:iterator value="publication.keywords">
			<s:textfield name="description" key="keyword" readonly="true" />
			<br>
		</s:iterator>


		<s:submit key="saveButton" />
	</s:form>


	<s:form action="publicationEditActiondelete">
		<s:hidden name="id" />
		<s:submit key="deleteButton" />
	</s:form>

	<s:form action="backAction">
		<s:submit key="backButton" />
	</s:form>


</body>
</html>
