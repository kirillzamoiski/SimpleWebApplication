package com.webproject.dao;

import com.webproject.entity.User;
import com.webproject.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void save(User user) {
        String sql = "INSERT INTO public.employee(first_name, last_name, department_id, job_title, gender, date_of_birth) VALUES (?, ?, ?, ?, ? ,?)";
        jdbcTemplate.update(sql, user.getFirst_name(), user.getLast_name(), user.getDepartment_id(), user.getJob_title(), user.getGender(), user.getData_of_birth());

    }

    public User getById(int employee_id) {
        String sql = "SELECT * FROM public.employee WHERE employee_id=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), employee_id);
    }

    public List<User> findAll() {
        String sql = "SELECT * FROM public.employee";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    public void update(User user) {
        String sql = "UPDATE public.employee\n" +
                "\tSET first_name=?, last_name=?, department_id=?, job_title=?, gender=?, date_of_birth=?\n" +
                "\tWHERE employee_id=?";
        jdbcTemplate.update(sql, user.getFirst_name(), user.getLast_name(),  user.getDepartment_id(), user.getJob_title(), user.getGender(), user.getData_of_birth(), user.getEmployee_id());
    }

    public void delete(int employee_id) {
        String sql = "DELETE FROM public.employee\n" +
                "\t WHERE employee_id=?";
        jdbcTemplate.update(sql, employee_id);

    }
}
