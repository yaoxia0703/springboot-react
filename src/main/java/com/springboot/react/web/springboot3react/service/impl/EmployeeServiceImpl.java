package com.springboot.react.web.springboot3react.service.impl;

import com.springboot.react.web.springboot3react.entity.Employee;
import com.springboot.react.web.springboot3react.mapper.EmployeeMapper;
import com.springboot.react.web.springboot3react.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeMapper.getEmployeeById(id);
    }

    @Override
    public Employee getEmployees(Employee employee) {
        return null;
    }

    @Override
    public int insertEmployee(Employee employee) {
        return employeeMapper.insertEmployee(employee);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public int deleteEmployee(Long id) {
        return employeeMapper.deleteEmployee(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeMapper.findAll();
    }
}
