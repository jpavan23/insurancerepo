package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.VehicleEntity;
import com.example.service.VehicleService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:3000")
@AllArgsConstructor
public class VehicleController {
	
	@Autowired
	VehicleService vehiclesercive;
	
	@PostMapping("/vinsurance")
	@ResponseStatus(HttpStatus.CREATED)
	public VehicleEntity addinsurance(@RequestBody VehicleEntity entity) {
		return vehiclesercive.insertintorepo(entity);
	}
	
	@GetMapping("/vinsurance/{vehicleno}")
	@ResponseStatus(HttpStatus.OK)
	public Optional <VehicleEntity> getbyid(@PathVariable int vehicleno ) {
		return vehiclesercive.getbyid(vehicleno);
	}
	@GetMapping("/vinsurance")
	public List<VehicleEntity>getAll(){
		System.out.println("Get all users Data");
		return vehiclesercive.getAlldetails();
	}
	

}
