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
	<s:text name="headingSearchPublicationResult" />
</h1>
<body>
	<s:head />
	<s:form action="sortPublicationAction">
		<s:submit key="sortButton">
			<s:radio name="sort" key="sort"
				list="{getText('up'),getText('down')}" />
			<s:radio name="sortBy" key="sortBy"
				list="{getText('id'),getText('title'),getText('stored'),getText('kindOfPublication'),getText('releaseDate'),getText('authors'),getText('keywords')}" />
			<s:hidden value="#session.publication" />
			<s:iterator value="searchList" status="row">
				<s:hidden name="searchList[%{#row.index}]" />
			</s:iterator>
		</s:submit>
	</s:form>

	<table border="2ppx">
		<tr>
			<th><s:text name="id" /></th>
			<th><s:text name="title" /></th>
			<th><s:text name="stored" /></th>
			<th><s:text name="kindOfPublication" /></th>
			<th><s:text name="releaseDate" /></th>
			<th><s:text name="authors" /></th>
			<th><s:text name="keywords" /></th>

		</tr>
		<s:iterator value="publication">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="title" /></td>
				<td><s:property value="stored" /></td>
				<td><s:property value="kindOfPublication.kind" /></td>
				<td><s:property value="releaseDate" /></td>
				<td><s:iterator value="authors">
						<s:property value="name" />
					</s:iterator></td>
				<td><s:iterator value="keywords">
						<s:property value="description" />
					</s:iterator></td>
				<td><s:url id="detailURL" action="publicationEditSupply">
						<s:param name="id" value="id" />
					</s:url> <s:a href="%{detailURL}">Details</s:a></td>
			</tr>
		</s:iterator>
	</table>
	<s:form action="backAction">
		<s:submit key="backButton" />
	</s:form>
</body>
</html>

