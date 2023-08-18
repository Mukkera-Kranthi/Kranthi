<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>



<html>



<head>



<meta charset="ISO-8859-1">



<title>Insert title here</title>



</head>



<body>



	<h1>Employee Form</h1>



	<form:form action="saveEmp" method ="post" modelAttribute="emp" >

 

<table>



			<tr>



				<td><form:label path="employeeName">Employee Name:</form:label></td>



			</tr>



			<tr>



				<td><form:input type="text" path="employeeName" /></td>



			</tr>



			<tr>



				<td><form:label path="employeeId">Employee Id:</form:label></td>



			</tr>



			<tr>



				<td><form:input type="number" path="employeeId" /></td>



			</tr>



			<tr>



				<td><form:label path="employeeSalary">Employee Salary:</form:label>



				</td>



			</tr>



			<tr>



				<td><form:input type="number" path="employeeSalary" /></td>



			</tr>



			<tr>



				<td><input type="submit" value="submit"></td>



			</tr>



		</table>



	</form:form>



</body>



</html>