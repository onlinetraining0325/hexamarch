package com.java.hib;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Employ32")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employ {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)  
    @PrimaryKeyJoinColumn
	private int empId;
	private String name;
	private String email;

}
