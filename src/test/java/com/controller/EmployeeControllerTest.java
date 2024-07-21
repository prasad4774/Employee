package com.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.entity.Employee;
import com.serviceInter.EmpInterface;

@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {
	
	
	
	
	@Autowired
  private	MockMvc mockMvc;
	
	
	@Autowired
	private EmpInterface empInterface;
	
	
	Employee employee;

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
