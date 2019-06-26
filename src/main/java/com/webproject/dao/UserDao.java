package com.webproject.dao;

import com.webproject.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    User getById(int employee_id);

    List<User> findAll();

    void update(User user);

    void delete(int employee_id);

}
