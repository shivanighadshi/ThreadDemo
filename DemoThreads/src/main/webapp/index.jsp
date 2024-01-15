<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.javathread.Calculator"/>  
  
<%  
int m=obj.cube(3);  
out.print("cube of 3 is "+m);  
%>  
</body>
</html>