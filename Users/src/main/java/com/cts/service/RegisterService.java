package com.cts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Register;

import com.cts.repo.RegisterRepo;

@Service
public class RegisterService {
	
	@Autowired
	RegisterRepo repo;

	public Iterable<Register> getAllUsers() {
		
		return repo.findAll();
	}

	public Register searchByUserName(String userName, String password) {
		
		return repo.findByUserName(userName, password);

	}

	public Optional<Register> getUserDetailsById(Integer id) {
		
		return repo.findById(id);
	}

	public Register addUserDetails(Register r) {
		
		return repo.save(r);
	}

}
