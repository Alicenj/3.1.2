package ru.ibragimova.SpringBoot312.service;


import ru.ibragimova.SpringBoot312.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User showUserByID(int id);

    void deleteUserById(int id);

    void addUser(User user);

    void editUser(User user);
}