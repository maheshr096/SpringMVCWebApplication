package com.webapplication.WebApplication.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import com.webapplication.WebApplication.employe.Employee;

@Component
public class EmployeeService {

	private static List<Employee> employees = new ArrayList<>();
	private static long empId = 0;

	static {
		employees.add(new Employee(++empId, "vamsi", "java", "2 years"));
		employees.add(new Employee(++empId, "sandya", "spring", "1.6 years"));
		employees.add(new Employee(++empId, "Kiran", "Jsf", "2 years"));
		employees.add(new Employee(++empId, "mahesh", "System", "0.6 years"));

	}

	public List<Employee> findEmployees() {
		return employees;
	}

	public void addEmployees(Employee emp) {

		Employee employee = new Employee();
		employee.setId(++empId);
		employee = mapEmploye(emp);

		employees.add(employee);
	}

	public Employee mapEmploye(Employee emp) {

		Employee employee = new Employee();
		employee.setExperiaence(emp.getExperiaence());
		employee.setName(emp.getName());
		employee.setTechnology(emp.getTechnology());

		return employee;
	}

	public void deleteByID(long id) {

		employees.remove(findById(id));
	}

	public Employee findById(long id) {
		Employee empl = employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
		return empl;
	}

	/*
	 * public List<Employee> updateById(Employee employee) {
	 * 
	 * Employee emp = findById(employee.getId()); if (emp != null) {
	 * emp=mapEmploye(employee); return employees; } return null; }
	 */
	
	public List<Employee> updateById(Employee employee) {
	    Employee emp = findById(employee.getId());
	    if (emp != null) {
	        emp.setName(employee.getName());
	        emp.setTechnology(employee.getTechnology());
	        emp.setExperiaence(employee.getExperiaence());
	    }
	    return employees;
	}

}
