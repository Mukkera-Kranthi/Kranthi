<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body align="center">
		<h1>Employee details</h1>
		<table border=>
			<thead>
				<tr>
					<th>Employee Name</th>
					<th>Employee Id</th>
					<th>Employee Salary</th>
					<th>UPDATE</th>
					<th>DELETE<th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var = "emp" items = "${employees}">
					<tr>
						<td>${emp.employeeName}</td>
						<td>${emp.employeeId}</td>
						<td>${emp.employeeSalary}</td>
						<td> <a href=/employeeUpdate/${emp.employeeId}><button>Update</button></a></td>
						<td><a href=/employeeDelete/${emp.employeeId}><button>Delete</button></a></td>
						
					</tr>
				</c:forEach>
			</tbody>
			
		</table>
    
</body>
</html>