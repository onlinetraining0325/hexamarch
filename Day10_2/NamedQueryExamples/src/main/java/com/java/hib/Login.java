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
		@NamedQuery(
			name="validate",
			query="from Login where userName=:userName AND "
					+ "passCode=:passCode"
		)
		)
@Entity
@Table(name="Login")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Login {

	@Id
	private String userName;
	private String passCode;
}
