package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Registrationdto;
import com.example.entity.Registration;
import com.example.service.RegistrationService;



@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("api/v1/")
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;
	
	@PostMapping("RegisterUser")
	@ResponseStatus(HttpStatus.CREATED)
	public Registration addUser(@RequestBody Registration rentity) {
		return registrationService.createdetails(rentity);
	}
	
	@GetMapping("GetUsers")
	public List<Registration> getAll() {
		System.out.println("calling get users");
		return registrationService.getAlldetails();
	}
	
	@PostMapping("Login")
	public String login(@RequestBody Registrationdto user) {
		System.out.println("calling Login...."+user.toString());
		return registrationService.loginValidation(user);
	}
	
	@DeleteMapping("DeleteAll")
	@ResponseStatus(HttpStatus.OK)
	public String deleteall() {
		return registrationService.deleteAllRecords();
	}
}

