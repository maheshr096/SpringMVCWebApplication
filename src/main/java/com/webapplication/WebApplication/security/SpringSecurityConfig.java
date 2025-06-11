package com.webapplication.WebApplication.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfig {
	
	// if we are saving the user credentials (name & passwords), we are using the LDAP and database.
	
	// if you saving the temprorly you can use InMemoryUserDetailsManager
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		
		UserDetails user = newUsercredentials("vamsi", "dummy");
		UserDetails user2 = newUsercredentials("sandya", "sister");
	return new InMemoryUserDetailsManager(user);
		
	}

	private UserDetails newUsercredentials(String username, String password) {
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
		UserDetails user	=
		//	User.withDefaultPasswordEncoder() // this method is deprecated but it's work.
				User.builder()
				.passwordEncoder(passwordEncoder)
				.username(username)
			    .password(password)
			    .roles("user")
			    .build();
		return user;
	}
	
	
	

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

}
