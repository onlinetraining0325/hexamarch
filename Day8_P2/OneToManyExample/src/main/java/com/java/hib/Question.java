package com.java.hib;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Question32")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String qname;
	
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="qid")  
	private List<Answer> answers;


}
