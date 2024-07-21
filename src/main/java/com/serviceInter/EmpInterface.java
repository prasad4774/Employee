package com.serviceInter;

import java.util.List;
import java.util.Optional;

import com.entity.Employee;

public interface EmpInterface {
	
	
	
	public void saveEmp(Employee e);

	
	
	public List<Employee> getEmp();
	
	public void deletebyID(int eID);
	
	public Employee updateEmp(Employee e , int eID);
	
	
	public Employee getbyName(String eName);



	public Optional<Employee> findByID(int eID);
}
