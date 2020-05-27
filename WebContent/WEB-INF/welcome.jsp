<%@ page import="com.model.LoginModel" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Bank</title>
</head>
<body>

<%

LoginModel model = (LoginModel) request.getAttribute("Data");
out.print("Welcome " + model.getUsername() + ", here are your accounts:");

%>

</body>
</html>