package webpackage.dao;

import webpackage.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserBydId(Long id);
    void saveUser(User user);
    void removeUserById(Long id);
}
