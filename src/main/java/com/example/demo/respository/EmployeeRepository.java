package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails,
 Long> {
}
