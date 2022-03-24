package com.th.service;

import java.util.List;

import com.th.model.User;

public interface UserServiceInterface {
public User create(User us);
public List<User> findAll();
public List<User> searchNomPrenom(String nom,String prenom);
public void deleteUser(long id);
public List<User> findOrder();
}
