package com.demo.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.management.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
