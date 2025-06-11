package com.webapplication.WebApplication.service;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {

	public boolean authenticate(String uname, String passwd) {
		
		 boolean validUname = uname.equalsIgnoreCase("vamsi");
		boolean validPasswd = passwd.equalsIgnoreCase("dummy");
		
		return validUname && validPasswd;
	}
}
