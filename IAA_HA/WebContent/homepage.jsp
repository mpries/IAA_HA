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
	<s:text name="headingHomepage" />
</h1>
<body>
	<s:head />
	<table>
		<tr>
			<th><s:form action="/kindOfPublication.jsp">
					<s:submit key="createPublicationButton" />
				</s:form></th>
			<th><s:form action="/createCustomer.jsp">
					<s:submit key="createCustomerButton" />
				</s:form></th>
			<th><s:form action="/search/searchPublication.jsp">
					<s:submit key="searchPublicationButton" />
				</s:form></th>
			<th><s:form action="/coreDataAdministration.jsp">

					<s:submit key="coreDataAdministratorButton" />
				</s:form></th>
			<th><s:form action="/lendActionexecute">
					<s:submit key="createBookOnLoanButton" />
				</s:form></th>
			<th><s:form action="/viewLendingAction_supply">
					<s:submit key="openLendingsButton" />
				</s:form></th>

		</tr>
	</table>
	<h4 style="color: red">
		<s:text name="booksOnLoanRemainder" />
	</h4>
	<br>
	<s:form action="sortLendingRemainderAction">
		<s:submit key="sortButton">
			<s:radio name="sort" list="{getText('up'),getText('down')}"
				key="sort" />
			<s:radio name="sortBy" key="sortBy"
				list="{getText('lendingId'),getText('warningId'),getText('loanDate'),getText('returnDate'),getText('customerId'),getText('customerName'),getText('publicationId'),getText('publicationTitle')}" />
		</s:submit>
	</s:form>
	<s:form action="showWarning">
		<s:submit key="showWarningButton" />
		<table border="2ppx">
			<tr>
				<th><s:text name="lendingId" /></th>
				<th><s:text name="warningId" /></th>
				<th><s:text name="loanDate" /></th>
				<th><s:text name="returnDate" /></th>
				<th><s:text name="customerId" /></th>
				<th><s:text name="customerName" /></th>
				<th><s:text name="publicationId" /></th>
				<th><s:text name="publicationTitle" /></th>

			</tr>

			<s:iterator value="lendingsWithWarning">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="warning.id" /></td>
					<td><s:property value="loanDate" /></td>
					<td><s:property value="returnDate" /></td>
					<td><s:property value="customer.customerId" /></td>
					<td><s:property value="customer.firstName" /> <s:property
							value="customer.lastName" /></td>
					<td><s:property value="publication.id" /></td>
					<td><s:property value="publication.title" /></td>
				</tr>
			</s:iterator>

		</table>



	</s:form>
</body>
</html>

