package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.respository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
private EmployeeRepository employeeRepository;

public List<EmployeeDetails> getEmployees(){
return employeeRepository.findAll();
}
public EmployeeDetails getEmployeeById(Long employeeId) {
return	employeeRepository.findById(employeeId).get();
}
public EmployeeDetails addEmployee(EmployeeDetails employeeDetails) {
	return employeeRepository.save(employeeDetails);
}
public void deleteById(Long employeeId) {
employeeRepository.deleteById(employeeId);	
}
public EmployeeDetails updateEmployee(EmployeeDetails employeeDetails, Long employeeId) {
	
return employeeRepository.save(employeeDetails);
}

}
