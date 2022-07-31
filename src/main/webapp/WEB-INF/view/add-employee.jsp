<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: sasha
  Date: 22.07.2022
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form action="saveEmployee" modelAttribute="employee" method = "get">
    <form:hidden path ="id"/>

    Name<form:input path = "name"/>
    <br><br>
    Surname<form:input path = "surname"/>
    <br><br>
    Salary<form:input path = "salary"/>
    <br><br>
    Department<form:select path = "department">
    <form:option value="Information Technology" label = "IT"/>
    <form:option value = "Human Resources" label = "HR"/>
    <form:option value = "Sales" label = "Sales"/>
</form:select>
    <br><br>
    <input type = "Submit" value = "OK">
</form:form>
</body>
</html>
