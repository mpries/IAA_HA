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
<s:head/>
	<table>
			<tr>
				<th><h3>Customer Data Editor</h3></th>
				<s:form action="searchCustomerAction">
					<th><s:textfield label="ID" key="id" /></th>
					<th><s:submit value="Search" />
				</s:form>
			</tr>
			<tr>
				<th><s:form action="homepage.jsp">
						<s:submit value="Back" />
					</s:form></th>
			</tr>
	</table>


</body>
</html>