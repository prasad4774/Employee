package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.repository.EmployeeRepository;
import com.serviceInter.EmpInterface;

@Service
public class EmployeeService implements EmpInterface {
	
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	

	@Override
	public void saveEmp(Employee e) {

		employeeRepository.save(e);
		
	}


	@Override
	public List<Employee> getEmp() {
		
		return employeeRepository.findAll();
	}


	@Override
	public void deletebyID(int eID) {
		
		employeeRepository.deleteById(eID);
		
	}


	@Override
	public Employee updateEmp(Employee e, int eID) {
	
		
		Optional<Employee> emp = employeeRepository.findById(eID);
		
		if(emp.isPresent())
		{
			
			Employee save = employeeRepository.save(e);
			
			return save;
		}
		else {
			System.out.println("Employee Not Found");
		}
		
		
		return null;
	}


	@Override
	public Employee getbyName(String eName) {
	
		 Employee name = employeeRepository.findByeName(eName);
		
		return name;
	}


	@Override
	public Optional<Employee> findByID(int eID) {
	return employeeRepository.findById(eID);
		
		
	
		
	}

	
	
	
	
	
}
