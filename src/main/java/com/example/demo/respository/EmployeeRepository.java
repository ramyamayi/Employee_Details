package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeDetails;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetails,
 Long> {
}
