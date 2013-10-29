<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>Customer Data Editor</h1>
<body>
	<table>

		<s:form action="SearchAction">
			<tr>
				<h3>Customer Data Editor</h3>
				<s:textfield label="Matrikel No." name="MatrikelNo" />
				<s:form action="SearchAction">
					<s:submit value="Search" />
				</s:form>
			</tr>
			<tr>
				<s:textfield label="First Name" name="FirstName" />
			</tr>
			<tr>
				<s:textfield label="Last Name" name="LastName" />
			</tr>
			<s:textfield label="Mail Address." name="MailAddress" />
			<tr>
				<s:form action="">
					<!--  Save action  -->
					<s:submit value="Save" />
				</s:form>

				<s:form action="homepage.jsp">
					<s:submit value="Back" />
				</s:form>
			</tr>
		</s:form>

	</table>

</body>
</html>