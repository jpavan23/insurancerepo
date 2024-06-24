package com.example.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.VehicleEntity;

@Repository
public interface Vehiclerepo extends JpaRepository<VehicleEntity, Integer> {
	
	

}
