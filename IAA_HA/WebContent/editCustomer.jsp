<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:form action="editCustomerAction">
	<s:hidden name="customer.id" />
	<s:textfield name="customer.firstName" label="First Name" />
	<s:textfield label="Last Name" name="customer.lastName" />
	<s:submit value="Save" />
	<s:submit value="Delete" action="deleteCustomerAction" />
	<s:form action="coreDataAdministration.jsp">
		<s:submit value="Back" />
	</s:form>
</s:form>