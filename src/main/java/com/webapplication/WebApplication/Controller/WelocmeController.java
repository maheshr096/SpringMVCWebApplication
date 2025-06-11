package com.webapplication.WebApplication.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelocmeController {

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goTOWelcomePage( ModelMap model) {
			model.put("name", getName());
			return "welcome";

	}
	
	public String getName() {
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName(); 
	}
}
