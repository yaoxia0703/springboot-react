package com.springboot.react.web.springboot3react.controller;

import com.springboot.react.web.springboot3react.entity.Employee;
import com.springboot.react.web.springboot3react.service.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("findAll")
    public List<Employee> listEmployees() {
        //System.out.println(employeeService.findAll());
        return employeeService.findAll();
    }

    @GetMapping("/getEmployeeByID")
    public Employee getEmployeeByID(@Param("id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/add")
    public int insertEmployee(@RequestBody Employee employee) {
        return employeeService.insertEmployee(employee);
    }

    @PutMapping("/edit")
    public int updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/delete")
    public int deleteEmployee(@Param("id") Long id) {
        return employeeService.deleteEmployee(id);
    }

}
