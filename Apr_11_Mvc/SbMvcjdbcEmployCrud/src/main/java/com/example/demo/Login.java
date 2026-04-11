package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Login")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Login {

	@Id
	private String username;
	private String passcode;
}
