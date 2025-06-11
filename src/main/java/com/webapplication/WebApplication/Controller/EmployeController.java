package com.webapplication.WebApplication.Controller;

import java.util.List;

import javax.naming.Binding;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapplication.WebApplication.employe.Employee;
import com.webapplication.WebApplication.service.AuthenticationService;
import com.webapplication.WebApplication.service.EmployeeService;

import jakarta.validation.Valid;

//@Controller
public class EmployeController {

	private EmployeeService employeeService;
	
	public EmployeController(EmployeeService employeeService) {
		super();

		this.employeeService = employeeService;
	}	
		@RequestMapping(value="/list-employees")
		public String listEmployees(ModelMap model) {
			List<Employee> employee=employeeService.findEmployees();
			model.addAttribute("employees", employee);
			return "list-employees";
		}
		
		@RequestMapping(value="/add-employee",  method = RequestMethod.GET)
		public String addNewEmployes() {
			return "add-employee";
		}
		
		@RequestMapping(value="/add-employee", method = RequestMethod.POST)
		public String redirectViewEmployes(ModelMap model,@Valid Employee emp, BindingResult result ) {
			if(result.hasErrors()) {
				return "add-employee";
			}
			employeeService.addEmployees(emp);
		
			return "redirect:list-employees";
		}
		
		@RequestMapping("delete-todo")
		public String deleteById(@RequestParam long id) {
			employeeService.deleteByID(id);
			return "redirect:list-employees";
		}
		
		@RequestMapping(value = "update-employe",method = RequestMethod.GET) 
		public String updateByid(@RequestParam long id,ModelMap model) {
			Employee employee =employeeService.findById(id);
			model.addAttribute("employee",employee);
			return "update";
		}
		
		@RequestMapping(value="update-employe", method = RequestMethod.POST)
		public String showUpdateData(@Valid Employee employee,ModelMap model, BindingResult bindingResult) {
			if (bindingResult.hasErrors()) {
				return "update";
			}
			
			List<Employee> emp =employeeService.updateById(employee);
			model.addAttribute("employees", emp);
			return "redirect:list-employees";
		}
	}


