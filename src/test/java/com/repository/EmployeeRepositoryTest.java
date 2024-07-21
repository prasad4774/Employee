package com.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.entity.Employee;

@DataJpaTest
class EmployeeRepositoryTest {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Autowired
	private TestEntityManager entityManager;
	
	
	@BeforeEach
	void setUp()
	{
		
		

		Employee emp= Employee.builder().eID(1)
				.eName("vijay")
				.eDepartment("civil")
				.eMobile(788756170)
				.eAddress("baner")
				.build();
		 entityManager.persist(emp);
		 
	}
	
	

	@Test
	public void testfindbyid()
	{
		   Employee employee = employeeRepository.findById(1).get();
		   
		   assertEquals(employee.getEDepartment(), "civil");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
