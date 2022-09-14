package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/Employees")
	public List<EmployeeDetails> getEmployees() {
		return employeeService.getEmployees();
	}
	@GetMapping("/Employees/{id}")
	public EmployeeDetails getEmployeeById(@PathVariable ("id") Long employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}
    @PostMapping("/Employees")
	public EmployeeDetails addEmployee(@RequestBody EmployeeDetails employeeDetails) {
		return employeeService.addEmployee(employeeDetails);
	}
    @DeleteMapping("Employees/{id}")
    public void deleteEmployeeById (@PathVariable ("id") Long employeeId) {
    	employeeService.deleteById(employeeId);
    }
    @PutMapping("Employees/{id}")
    public EmployeeDetails update (@RequestBody EmployeeDetails employeeDetails,@PathVariable("id") Long employeeId) {
    	return employeeService.updateEmployee(employeeDetails,employeeId);
    }


}
