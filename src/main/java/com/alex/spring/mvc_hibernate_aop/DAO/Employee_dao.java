package com.alex.spring.mvc_hibernate_aop.DAO;

import com.alex.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface Employee_dao{
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}





