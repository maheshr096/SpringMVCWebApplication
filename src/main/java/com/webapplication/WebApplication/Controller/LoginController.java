/*
 * package com.webapplication.WebApplication.Controller;
 * 
 * import java.util.List;
 * 
 * import javax.naming.Binding;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.ui.ModelMap; import
 * org.springframework.validation.BindingResult; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RequestParam;
 * 
 * import com.webapplication.WebApplication.employe.Employee; import
 * com.webapplication.WebApplication.service.AuthenticationService; import
 * com.webapplication.WebApplication.service.EmployeeService;
 * 
 * import jakarta.validation.Valid;
 * 
 * 
 * @Controller public class LoginController {
 * 
 * // @RequestMapping(value ="/login") // @ResponseBody // public String
 * LoginView() { // return "Hi welcome to the login page"; // }
 * 
 * private AuthenticationService authenticationService; private EmployeeService
 * employeeService;
 * 
 * public LoginController(AuthenticationService authenticationService,
 * EmployeeService employeeService) { super(); this.authenticationService =
 * authenticationService; this.employeeService = employeeService; }
 * 
 * @RequestMapping(value ="/login", method = RequestMethod.GET)
 * 
 * public String LoginView() {
 * 
 * return "login"; }
 * 
 * @RequestMapping(value = "/login", method = RequestMethod.POST) public String
 * goTOWelcomePage(@RequestParam String name, @RequestParam String password,
 * ModelMap model) { if(authenticationService.authenticate(name, password)) {
 * model.put("name", name); return "welcome"; } model.put("error",
 * "Please enter valid details"); return "login"; }
 * 
 * 
 * }
 */