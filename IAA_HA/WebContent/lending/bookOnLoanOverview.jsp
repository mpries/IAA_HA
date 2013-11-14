<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>Book on loan Overview</h1>
<body>
	<s:form action="sortLendingAction">
		<s:submit value="sort">
			<s:radio name="sort" label="sort" list="{'up','down'}" />
			<s:radio name="sortBy" label="sortBy"
				list="{'Id','loanDate','returnDate','Customer Id','Customer Name','Publication Id','Publication Title'}" />
		</s:submit>
	</s:form>
	<table border="2ppx">
		<tr>
			<th>Lending Id</th>
			<th>Loan Date</th>
			<th>Return Date</th>
			<th>Customer Id</th>
			<th>Customer Name</th>
			<th>Publication Id</th>
			<th>Publication Title</th>

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
					</s:url> <s:a href="%{extendURL}">Extend</s:a></td>

				<td><s:url id="returnURL"
						action="viewLendingAction_returnPublication">
						<s:param name="id" value="id" />
					</s:url> <s:a href="%{returnURL}">Return</s:a></td>
			</tr>
		</s:iterator>


	</table>
</body>
</html>