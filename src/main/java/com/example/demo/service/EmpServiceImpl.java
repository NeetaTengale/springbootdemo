package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
  private EmployeeRepository empRepo;
	@Override
	public Employee saveEmplyee(Employee emp) {
		
		return empRepo.save(emp);
	}
	@Override
	public Optional<Employee> findById(Integer id) {
		Optional<Employee> emp1=empRepo.findById(id);
		return emp1;
	}
	@Override
	public void deleteById(Integer id) {
		empRepo.deleteById(id);
		
	}

}
