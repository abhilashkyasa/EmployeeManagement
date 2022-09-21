package com.example.Employee_Management.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.example.Employee_Management.model.Employee;

public interface Employeerepository extends PagingAndSortingRepository<Employee, Long> {
    Employee findById(long id);
}