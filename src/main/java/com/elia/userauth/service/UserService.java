package com.elia.userauth.service;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	public boolean login(String email, String password) {
		if(email.equals("elia") && password.equals("1234")){
		return true;
	}
return false;
}
}