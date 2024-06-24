package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.VehicleEntity;
import com.example.repo.Vehiclerepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class VehicleService {
	
	@Autowired
	Vehiclerepo repo;
	
	public VehicleEntity insertintorepo(VehicleEntity vehicleentity) {
		log.info("Successfully added a Insurance");
		return repo.save(vehicleentity);
		
	}

	public Optional<VehicleEntity> getbyid(int vehicleno) {
		Optional<VehicleEntity> entity= repo.findById(vehicleno);
		return entity;
	}

	public List<VehicleEntity> getAlldetails() {
		List<VehicleEntity> newentity=repo.findAll();
		return newentity;
	}

	

}
