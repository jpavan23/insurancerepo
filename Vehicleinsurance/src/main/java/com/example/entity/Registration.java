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
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name=" registration")

public class Registration {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String Username;
    @Nonnull
	private String Password;
	private String Email;
	private String Mobile;
		
}
