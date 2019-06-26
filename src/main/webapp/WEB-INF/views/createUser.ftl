<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create employee page</title>
</head>
<body>
    <h1>Create employee</h1>
    <form name="user" action="/webapplication_war/addUser" method="post">
        <p>first_name</p><input title="first_name" type="text" name="first_name" maxlength="10">
        <p>last_name</p><input title="last_name" type="text" name="last_name" maxlength="10">
        <p>department_id</p><input title="department_id" type="text" name="department_id" maxlength="10">
        <p>job_title</p><input title="job_title" type="text" name="job_title" maxlength="10">
        <p>gender</p><input title="gender" type="text" name="gender" maxlength="10">
        <p>data_of_birth</p><input title="data_of_birth" type="text" name="data_of_birth" maxlength="10"><br>
        <br>
        <button type="submit" value="OK">Save employee</button>
    </form>
</body>
</html>