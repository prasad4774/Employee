package com.serviceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockitoSession;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.entity.Employee;
import com.repository.EmployeeRepository;
import com.serviceInter.EmpInterface;

@SpringBootTest
class EmployeeServiceTest {
	
	
	@Autowired
	private EmpInterface empInterface;
	
	
	@MockBean
	private EmployeeRepository employeeRepository;
	
	@BeforeEach
	public void setup()
	{
		
		Employee emp= Employee.builder().eID(1)
				.eName("prasad")
				.eDepartment("IT")
				.eMobile(788756170)
				.eAddress("pune")
				.build();
		
		Mockito.when(employeeRepository.findByeName("prasad"))
		   .thenReturn(emp);
		
		  
		
	}
	

	@Test
	public void testgetbyName()
	{
		
		String name="prasad";
//		String  name ="abc";
		Employee name2 = empInterface.getbyName(name);
		
		  assertEquals(name,name2.getEName());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

	

}
