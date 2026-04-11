package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="Employ")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employ {

	@Id
	private int empno;
	private String name;
	private String gender;
	private String dept;
	private String desig;
	private double basic;
}
