<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>Nordakademie Bib-System</h1>
<body>

	<table>
		<tr>
			<th><s:form action="kindOfPublication.jsp">
					<s:submit value="Create Publikation" />
				</s:form></th>
			<th><s:form action="createCustomer.jsp">
					<s:submit value="Create Customer" />
				</s:form></th>
			<th><s:form action="/search/searchPublication.jsp">
					<s:submit value="Search Publication" />
				</s:form></th>
			<th><s:form action="coreDataAdministration.jsp">
					<s:submit value="Core Data Administrator" />
				</s:form></th>
			<th><s:form action="lendActionsupply">
					<s:submit value="Create Book on loan" />
				</s:form></th>
			<th><s:form action="viewLendingAction_supply">
					<s:submit value="Open Lendings" />
				</s:form></th>

		</tr>
	</table>
	<s:form action="sortLendingRemainderAction">
		<s:submit value="sort">
			<s:radio name="sort" label="sort" list="{'up','down'}" />
			<s:radio name="sortBy" label="sortBy"
				list="{'Id','Warning Id','loanDate','returnDate','Customer Id','Customer Name','Publication Id','Publication Title'}" />
		</s:submit>
	</s:form>
	<h4 style="color: red">Books on loan remainder</h4>
	<s:form action="showWarning">
		<s:submit value="Show Warning" />
		<table border="2ppx">
			<tr>
				<th>Lending Id</th>
				<th>Warning Id</th>
				<th>Loan Date</th>
				<th>Return Date</th>
				<th>Customer Id</th>
				<th>Customer Name</th>
				<th>Publication Id</th>
				<th>Publication Title</th>

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

