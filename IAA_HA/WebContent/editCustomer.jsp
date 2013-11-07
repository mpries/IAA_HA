<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="editCustomer">
	<s:hidden name="customer.id"/>
	<s:textfield name="customer.firstName" label="First Name"/>
	<s:textfield name="customer.lastName" label="Last Name"/>
	<s:submit value="Save"/>
	<s:submit value="Cancel" action="coreDataAdministration.jsp"/>
</s:form>