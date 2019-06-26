package com.webproject.service;

import com.webproject.dao.UserDao;
import com.webproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    public UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }


    public void save(User user) {
        userDao.save(user);
    }


    public User getById(int employee_id) {
        return userDao.getById(employee_id);
    }



    public void update(User user) {
        userDao.update(user);

    }


    public void delete(int employee_id) {
        userDao.delete(employee_id);
    }
}
