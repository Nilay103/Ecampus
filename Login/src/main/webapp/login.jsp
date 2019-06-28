<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel = "stylesheet" type = "text/css" href = "DeanStyle.css">
</head>
<body>

<s:form action="login">
<table class = "gridtable" style = "margin-top : 20%;">
<s:textfield name="user"  label="Email:"></s:textfield>
<s:password key="password" label="Password:"></s:password>
<s:submit class = "submit-button" value="login" />
</table>
</s:form>

<s:if test="hasActionErrors()">
<s:actionerror/>
</s:if>	
</body>
</html>