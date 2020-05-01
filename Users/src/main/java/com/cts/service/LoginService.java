package com.cts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Login;
import com.cts.repo.LoginRepo;

@Service
public class LoginService {
	
	@Autowired
	LoginRepo repo;

	public Iterable<Login> getAllUsers() {
	
		return repo.findAll();
	}

	public Login searchByUserName(String userName, String password) {
		
		return repo.findByUserName(userName, password);
	}

	public Optional<Login> getUserDetailsById(Integer id) {
		
		return repo.findById(id);
	}

	public Login addUserDetails(Login l) {
	
		return repo.save(l);
		
	}
	
	
}
