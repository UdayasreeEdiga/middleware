package com.cts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Register;
import com.cts.service.RegisterService;

@RestController
@CrossOrigin
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	RegisterService regservice;
	
	@RequestMapping("/")
	Iterable<Register> getAllUsers(){
		return regservice.getAllUsers();
	}
	
	@RequestMapping("/{userName}/{password}")
	Register searchByUsername(@PathVariable String userName, @PathVariable String password){
		return regservice.searchByUserName(userName, password);
	}
	
	@RequestMapping("/{id}")
	Optional<Register> getUserDetailsById(@PathVariable Integer id) {
		return regservice.getUserDetailsById(id);
	}
	
	  @RequestMapping(method=RequestMethod.POST,value="/details")
		void addReviews(@RequestBody Register r) {
			regservice. addUserDetails(r);
	    }
	
	
	
		

}
