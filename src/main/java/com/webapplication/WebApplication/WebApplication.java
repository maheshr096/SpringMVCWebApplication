package com.webapplication.WebApplication;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	//All URLs are protected
		//A login form is shown for unauthorized requests
		//CSRF disable
		//Frames
		
		@Bean
		public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
			
			http.authorizeHttpRequests(
					auth -> auth.anyRequest().authenticated());
			http.formLogin(withDefaults());
			
			http.csrf().disable();
			http.headers().frameOptions().disable();
			
			return http.build();
		}
}
