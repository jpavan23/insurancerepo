package com.example.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Registrationdto;
import com.example.entity.Registration;
import com.example.repo.Registrationrepo;

import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class RegistrationService {
	
	@Autowired
	Registrationrepo registrationRepo;
	
	public Registration createdetails(Registration request) {
		log.info("Successfully added a Userdetails");
		return registrationRepo.save(request);
	}
	
	public List<Registration> getAlldetails() {
		List<Registration> listofdetails = registrationRepo.findAll();
		//for(Registration records:registrationRepo)
		return listofdetails;
		
	}
	
	public String loginValidation(Registrationdto user) {
		Registration isUserExists= registrationRepo.getByUsernamePassword(user.getUsername(), user.getPassword());
		if(isUserExists==null) {
			return "Please validate Credentials";
		}
		else {
			return user.getUsername()+" Login successfully";
		}
	}
	
	public String deleteAllRecords() {
		registrationRepo.deleteAll();
		return "All records deleted successfully";
	}
}

