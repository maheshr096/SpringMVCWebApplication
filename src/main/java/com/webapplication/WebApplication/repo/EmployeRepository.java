package com.webapplication.WebApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapplication.WebApplication.employe.Employee;

@Repository
public interface EmployeRepository extends JpaRepository<Employee, Long> {

	
}
