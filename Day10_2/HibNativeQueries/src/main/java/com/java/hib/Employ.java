package com.java.hib;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NamedNativeQuery(
		name="Employ.findAll",
		query="SELECT * FROM Employ",
		resultClass = Employ.class
		)
@NamedNativeQuery(
		name="Employ.Search",
		query="SELECT * FROM Employ Where empno=:empno",
		resultClass = Employ.class
		)
@Table(name="Employ")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employ {

	@Id
	private int empno;
	private String name;
	private String gender;
	private String dept;
	private String desig;
	private double basic;
}
