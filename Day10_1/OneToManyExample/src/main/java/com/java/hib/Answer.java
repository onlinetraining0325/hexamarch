package com.java.hib;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Answer32")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Answer {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String answerName;
	private String postedBy;
}
