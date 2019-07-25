<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 6/24/2019
  Time: 8:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer List</title>
    <style>
        table{
            width:100%;
        }
        .theadtab{
            background-color: green;
            color : snow;
        }
        table,th,td{
            border:1px solid gray;
            border-collapse: collapse;
        }
        th,td{
            padding:7px 15px;
        }
        th{
            background-color: #008040;
            color: white;
        }
        tr:nth-child(even){
            background-color: #F0F0F0;
        }
        tr:hover{
            background-color: #ddd;
        }
    </style>
</head>
<body>
<h1 color="grey">Customers</h1>
<p>
    <a href="/customers?action=create">Create new customer</a>
</p>
<table >
    <tr class="theadtab">
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["customers"]}' var="customer">
        <tr>
            <td><a href="/customers?action=view&id=${customer.getId()}">${customer.getName()}</a></td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
            <td><a href="/customers?action=edit&id=${customer.getId()}">edit</a></td>
            <td><a href="/customers?action=delete&id=${customer.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
