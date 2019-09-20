package com.example.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;


public class EmployeeService implements EmployeeInterface{

	
	private  ArrayList<Employee> emplist;
	 
	public EmployeeService() {
		// TODO Auto-generated constructor stub
		emplist=new ArrayList<Employee>();
		
			Employee e=new Employee(1, "yogesh", "here", "nanded", "9561418127");
			Employee e1=new Employee(2, "yogesh1", "here1", "nanded1", "95614181271");
			Employee e2=new Employee(3, "yogesh2", "here2", "nanded2", "95614181272");
			Employee e3=new Employee(4, "yogesh3", "here3", "nanded3", "95614181273");
			emplist.add(e);
			emplist.add(e1);
			emplist.add(e2);
			emplist.add(e3);
		
	}
	
	@Override
	public Employee getEmployee(int id) {

		Iterator<Employee> iterate=emplist.iterator();
		while(iterate.hasNext())
		{
			Employee e=(Employee)iterate.next();
			if(e.getId()==id)
			{
				return e;
				
			}
		}
		return null;
	}

	@Override
	public ArrayList<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return emplist;
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Employee> deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Iterator<Employee> iterate=emplist.iterator();
		while(iterate.hasNext())
		{
			Employee e=(Employee)iterate.next();
			if(e.getId()==id)
			{
				emplist.remove(e);
				
			}
		}
	return emplist;
	}

	
}
