package com.webproject.service;

import com.webproject.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void save(User user);

    User getById(int employee_id);

    void update(User user);

    void delete(int employee_id);

}