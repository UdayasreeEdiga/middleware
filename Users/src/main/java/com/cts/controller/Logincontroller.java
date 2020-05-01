package com.cts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Login;
import com.cts.service.LoginService;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class Logincontroller {
	
	@Autowired
	LoginService logservice;
	
	@RequestMapping("/")
	Iterable<Login> getAllUsers(){
		return logservice.getAllUsers();
	}
	
	@RequestMapping("/{userName}/{password}")
Login searchByUsername(@PathVariable String userName, @PathVariable String password){
		return logservice.searchByUserName(userName, password);
	}
	
	@RequestMapping("/{id}")
	Optional<Login> getUserDetailsById(@PathVariable Integer id) {
		return  logservice.getUserDetailsById(id);
	}
	
	 @RequestMapping(method=RequestMethod.POST,value="/ldetails")
		void addReviews(@RequestBody Login l) {
			logservice. addUserDetails(l);
	    }

}
