package com.webproject.mapper;

import com.webproject.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        User user = new User();
        user.setEmployee_id(resultSet.getInt("employee_id"));
        user.setFirst_name(resultSet.getString("first_name"));
        user.setLast_name(resultSet.getString("last_name"));
        user.setDepartment_id(resultSet.getInt("department_id"));
        user.setJob_title(resultSet.getString("job_title"));
        user.setGender(resultSet.getString("gender"));
        user.setData_of_birth(resultSet.getString("date_of_birth"));
        return user;
    }
}