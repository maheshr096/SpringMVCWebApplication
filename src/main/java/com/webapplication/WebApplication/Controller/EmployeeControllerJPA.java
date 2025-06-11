package com.webapplication.WebApplication.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapplication.WebApplication.employe.Employee;
import com.webapplication.WebApplication.repo.EmployeRepository;
import com.webapplication.WebApplication.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
public class EmployeeControllerJPA {

		private EmployeRepository employeRepository; 
		
		public EmployeeControllerJPA(EmployeRepository employeRepository) {
			super();

			this.employeRepository = employeRepository;
		}	
			@RequestMapping(value="/list-employees")
			public String listEmployees(ModelMap model) {
				List<Employee> employee=employeRepository.findAll();
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
				employeRepository.save(emp);
			
				return "redirect:list-employees";
			}
			
			@RequestMapping("delete-todo")
			public String deleteById(@RequestParam long id) {
				employeRepository.deleteById(id);
				return "redirect:list-employees";
			}
			
			@RequestMapping(value = "update-employe",method = RequestMethod.GET) 
			public String updateByid(@RequestParam long id,ModelMap model) {
				Employee employee =employeRepository.findById(id).get();
				model.addAttribute("employee",employee);
				return "update";
			}
			
			@RequestMapping(value="update-employe", method = RequestMethod.POST)
			public String showUpdateData(@Valid Employee employee,ModelMap model, BindingResult bindingResult) {
				if (bindingResult.hasErrors()) {
					return "update";
				}
				
				employeRepository.save(employee);
				List<Employee> emp =employeRepository.findAll();
				model.addAttribute("employees", emp);
				return "redirect:list-employees";
			}
		}




