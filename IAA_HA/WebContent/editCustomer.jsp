<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:form action="editCustomerAction">
	<s:hidden name="customer.id" />
	<s:textfield name="customer.firstName" label="First Name" />
	<s:textfield label="Last Name" name="customer.lastName" />
	<s:submit value="Save" />

	<s:form action="coreDataAdministration.jsp">
		<s:submit value="Back" />
	</s:form>
</s:form>
<s:form action="deleteCustomerAction">
	<s:hidden name="customer.id" />
	<s:hidden name="customer.firstName" />
	<s:hidden name="customer.lastName" />
	<s:submit value="Delete" />
</s:form>