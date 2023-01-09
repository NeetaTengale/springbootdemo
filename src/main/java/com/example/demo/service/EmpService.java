package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

public interface EmpService {

	public Employee saveEmplyee(Employee emp);
	public Optional<Employee>findById(Integer id);
	public void deleteById(Integer id);
}
