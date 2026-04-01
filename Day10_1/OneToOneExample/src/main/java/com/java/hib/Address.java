package com.java.hib;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Address34")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private int addressId;
	
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="empId")  
	private Employ employ;


}
