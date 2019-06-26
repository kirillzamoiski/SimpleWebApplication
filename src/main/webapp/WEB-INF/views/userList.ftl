<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employees List</title>
</head>
<body>

<h1>Employees List</h1>

<table>
    <tr>
        <th>employee_id</th>
        <th>first_name</th>
        <th>last_name</th>
        <th>department_id</th>
        <th>job_title</th>
        <th>gender</th>
        <th>data_of_birth</th>
    </tr>
    <#list users as user>
        <tr>
            <td><a href="/webapplication_war/user/${user.employee_id}">${user.employee_id}</a></td>
            <td>${user.first_name}</td>
            <td>${user.last_name}</td>
            <td>${user.department_id}</td>
            <td>${user.job_title}</td>
            <td>${user.gender}</td>
            <td>${user.data_of_birth}</td>
            <td><a href="/webapplication_war/delete/${user.employee_id}">Delete</a></td>
            <td><a href="/webapplication_war/update/${user.employee_id}">Update</a></td>
        </tr>
    </#list>
</table>
<a href="/webapplication_war/addUser">Create employee</a>
</body>
</html>