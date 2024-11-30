package com.springboot.react.web.springboot3react.service;

import com.springboot.react.web.springboot3react.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee getEmployeeById(Long id);

    public Employee getEmployees(Employee employee);

    public int insertEmployee(Employee employee);

    public int updateEmployee(Employee employee);

    public int deleteEmployee(Long id);

    public List<Employee> findAll();
}
