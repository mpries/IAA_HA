<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nordakademie Bib-System</title>
</head>
<h1>Nordakademie Bib-System</h1>
<body>

<s:form action="loginAction">
	<s:textfield key="userName" label="UserName" cssStyle="color:red" />
	<s:textfield key="password" label="Password" cssStyle="color:red" />
	<s:submit value="Login"/>
</s:form>

</body>
</html>


