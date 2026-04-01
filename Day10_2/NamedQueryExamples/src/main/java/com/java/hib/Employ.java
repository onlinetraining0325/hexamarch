package com.java.hib;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NamedQueries(
		{
			@NamedQuery(
				name="showEmploy",
				query="from Employ"
					),
			@NamedQuery(
				name="searchEmploy",
				query="from Employ where empno=:empno"
					)
		}
		)

@Entity
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
