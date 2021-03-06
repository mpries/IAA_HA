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
	<s:text name="headingBookOnLoanOverview"></s:text>
</h1>
<body>
	<s:head />
	<s:form action="sortLendingAction">
		<s:submit key="sortButton">
			<s:radio name="sort" key="sort"
				list="{getText('up'),getText('down')}" />
			<s:radio name="sortBy" key="sortBy"
				list="{getText('lendingId'),getText('loanDate'),getText('returnDate'),getText('customerId'),getText('customerName'),getText('publicationId'),getText('publicationTitle')}" />
		</s:submit>
	</s:form>
	<table border="2ppx">
		<tr>
			<th><s:text name="lendingId" /></th>
			<th><s:text name="loanDate" /></th>
			<th><s:text name="returnDate" /></th>
			<th><s:text name="customerId" /></th>
			<th><s:text name="customerName" /></th>
			<th><s:text name="publicationId" /></th>
			<th><s:text name="publicationTitle" /></th>

		</tr>

		<s:iterator value="lendings">
			<tr>
				<s:hidden name="warning.id" />
				<td><s:property value="id" /></td>
				<td><s:property value="loanDate" /></td>
				<td><s:property value="returnDate" /></td>
				<td><s:property value="customer.customerId" /></td>
				<td><s:property value="customer.firstName" /> <s:property
						value="customer.lastName" /></td>
				<td><s:property value="publication.id" /></td>
				<td><s:property value="publication.title" /></td>

				<td><s:url id="extendURL" action="viewLendingAction_extend">
						<s:param name="id" value="id" />
					</s:url> <s:a href="%{extendURL}">
						<s:text name="extend" />
					</s:a></td>

				<td><s:url id="returnURL"
						action="viewLendingAction_returnPublication">
						<s:param name="id" value="id" />
					</s:url> <s:a href="%{returnURL}">
						<s:text name="return" />
					</s:a></td>
			</tr>
		</s:iterator>


	</table>
	<s:form action="backAction">
		<s:submit key="backButton" />
	</s:form>
</body>
</html>