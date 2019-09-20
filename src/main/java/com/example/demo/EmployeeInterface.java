package com.example.demo;

import java.util.ArrayList;

public interface EmployeeInterface {
	
	public Employee getEmployee(int id);
	public ArrayList<Employee> getAllEmployees();
	public void updateEmployee(int id);
	public ArrayList<Employee>  deleteEmployee(int id);
}
