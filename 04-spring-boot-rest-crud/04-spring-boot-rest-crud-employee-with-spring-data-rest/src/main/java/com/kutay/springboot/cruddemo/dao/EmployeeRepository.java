package com.kutay.springboot.cruddemo.dao;

import com.kutay.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<entityType, primaryKey>
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
