package webpackage.service;

import webpackage.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    void removeUserById(long id);
    User getUserById(Long id);
    void updateUser(User user);
}
