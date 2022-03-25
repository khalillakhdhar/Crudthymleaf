package com.th.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.th.model.User;

public interface UserServiceInterface {
public User create(User us);
public Page<User> findAll(Pageable pageable);
public List<User> searchNomPrenom(String nom,String prenom);
public void deleteUser(long id);
public List<User> findOrder();
}
