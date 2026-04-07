package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {
	
	@Id
	private int ordId;
	private int cusId;
	private int venId;
	private String walSource;
	private int menId;
	private Date ordDate;
	private int ordQuantity;
	private double ordBillamount;
	private String ordStatus;
	private String ordComments;
}
