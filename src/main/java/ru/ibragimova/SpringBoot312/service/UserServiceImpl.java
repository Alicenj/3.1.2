package ru.ibragimova.SpringBoot312.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ibragimova.SpringBoot312.dao.UserDao;
import ru.ibragimova.SpringBoot312.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDAO;

    @Autowired
    public UserServiceImpl(UserDao userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    @Transactional
    public User showUserByID(int id) {
        return userDAO.showUserByID(id);
    }


    @Override
    @Transactional
    public void deleteUserById(int id) {
        userDAO.deleteUserById(id);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    @Transactional
    public void editUser(User user) {
        userDAO.editUser(user);
    }


}