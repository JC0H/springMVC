package ua.com.jcoh.service;

import ua.com.jcoh.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void save(String name);
    User findOne(int id);
    List<User> findAll();
}
