package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.serviceInter.EmpInterface;


@RestController
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	EmpInterface empInterface;

	@PostMapping("/save")
	public ResponseEntity<?> saveEmp(@RequestBody Employee e) {

		empInterface.saveEmp(e);

		return new ResponseEntity<>(HttpStatus.CREATED);

	}

	@GetMapping("/getEmp")
	public ResponseEntity<?> getEmp() {

		List<Employee> list = empInterface.getEmp();

		return new ResponseEntity<>(list, HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEmp(@PathVariable("id") int eID) {

		empInterface.deletebyID(eID);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateEmp(@RequestBody Employee e, @PathVariable("id") int eID)
	{
		
		  Employee employee = empInterface.updateEmp(e, eID);
		  
		  return new ResponseEntity<>(employee,HttpStatus.OK);
		
		
		
		
	}
	
	@GetMapping("/getbyName/{eName}")
	public ResponseEntity<?> getbyName(@PathVariable ("eName") String eName)
	{
		
		
		
		Employee name = empInterface.getbyName(eName);
		
		return new ResponseEntity<>(name,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/getbyId/{id}")
	public ResponseEntity<?> get(@PathVariable("id") int eID)
	{
		
		 Optional<Employee> emp = empInterface.findByID(eID);
		 
		 return new ResponseEntity<>(emp,HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
