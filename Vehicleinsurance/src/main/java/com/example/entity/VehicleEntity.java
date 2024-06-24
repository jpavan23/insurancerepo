package com.example.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name ="vinsurance")
@Entity
public class VehicleEntity {
	
	@Id
	
	private int  vehicle_no;
	@Nonnull
	private String vehicle_type;
	private String variant;
	private int premium_charges;
	private int insurance_timeperiod;
	private int vehicle_purchase_year;
	private int vehicle_manufacture_year;

}
