<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="editCustomerAction">
	<s:hidden key="customer.id"/>
	<s:textfield name="customer.firstName" label="First Name"/>
	<s:textfield label="Last Name" key="customer.lastName"/>
	<s:submit value="Save"/>
</s:form>