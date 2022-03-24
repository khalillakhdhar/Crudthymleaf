package com.th.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.th.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
List<User> findByNomAndPrenom(String nom,String prenom);
@Query("Select u from User u order by age")
List<User> findbyAgeOrder();

}
