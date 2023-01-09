package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmpService;
@RestController
@RequestMapping("/employee")
public class EmpController {

	@Autowired(required=true)
	private EmpService empService;
	@PostMapping("/save")
	public ResponseEntity<Employee>saveEmployee(@RequestBody Employee emp) {
	Employee emp1 =empService.saveEmplyee(emp);
	return ResponseEntity.ok().body(emp1);
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Employee>>getEmployeeById(@PathVariable ("id")Integer id) {
		Optional<Employee>optionalemp= empService.findById(id);
		return ResponseEntity.ok().body(optionalemp);

		}
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeById(@PathVariable ("id")Integer id) {
		 empService.deleteById(id);
		

		}
	

}
