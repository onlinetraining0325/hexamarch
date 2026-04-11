package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	public Login authentication(String user, String pwd) {
		return loginRepository.findByUsernameAndPasscode(user, pwd);
	}
}
