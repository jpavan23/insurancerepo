package com.example.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Registration;

@Repository
public interface Registrationrepo extends JpaRepository<Registration, Integer> {
	
	@Query("select a from Registration a where a.Username=?1 and a.Password=?2")
	public Registration getByUsernamePassword(String Username, String password);
	
	//"select u from User u where u.emailAddress = ?1"
	
}

