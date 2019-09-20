package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	private EmployeeService emp;
	public EmployeeController()
	{
		emp=new EmployeeService();
		
	}
	
	@GetMapping("/person/get/{id}")	
	public Employee getEmployee(@PathVariable int id)
	{
		return emp.getEmployee(id);
	}
	
	@GetMapping("/person/get")	
	public ArrayList<Employee> getEmployees()
	{
		return emp.getAllEmployees();
	}
	
	@GetMapping("/person/delete/{id}")
	public ArrayList<Employee> deleteEmployee(@PathVariable int id)
	{
		return emp.deleteEmployee(id);
	}
	
	
}
