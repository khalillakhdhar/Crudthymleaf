package com.th.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.th.model.User;
import com.th.repository.UserRepository;

@Service
public class UserService implements UserServiceInterface {
@Autowired
UserRepository userRepository;
	@Override
	public User create(User us) {
		// TODO Auto-generated method stub
		return userRepository.save(us);
	}

	@Override
	public Page<User> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return userRepository.findAll(pageable);
	}

	@Override
	public List<User> searchNomPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return userRepository.findByNomAndPrenom(nom, prenom);
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		
	}

	@Override
	public List<User> findOrder() {
		// TODO Auto-generated method stub
		return userRepository.findbyAgeOrder();
	}

}
