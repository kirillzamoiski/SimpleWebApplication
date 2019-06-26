<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee info page</title>
</head>
<body>
    <h1>Employee info</h1>
    <table  id="tables">
        <tr>
            <th>employee_id</th>
            <td>${user.employee_id}</td>
        </tr>
        <tr>
            <th>first_name</th>
            <td>${user.first_name}</td>
        </tr>
        <tr>
            <th>last_name</th>
            <td>${user.last_name}</td>
        </tr>
        <tr>
            <th>departure_id</th>
            <td>${user.department_id}</td>
        </tr>
        <tr>
            <th>job_title</th>
            <td>${user.job_title}</td>
        </tr>
        <tr>
            <th>gender</th>
            <td>${user.gender}</td>
        </tr>
        <tr>
            <th>data_of_birth</th>
            <td>${user.data_of_birth}</td>
        </tr>

    </table>

    <br>
    <a href="/webapplication_war/users">Back</a>
</body>
</html>