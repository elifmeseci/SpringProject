package com.example.proje.service;

import com.example.proje.entity.Employee;
import com.example.proje.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    //POST methods
    public Employee saveEmployee(Employee employee){
        return repository.save(employee);
    }
    public List<Employee> saveEmployees(List<Employee> employees){
        return repository.saveAll(employees);
    }

    //GET methods
    public List<Employee> getEmployees(){
        return repository.findAll();
    }
    public Employee getEmployeeById(int id){
        return repository.findById(id).orElse(null);
    }
    public Employee getEmployeeByName(String name){
        return repository.findByName(name);
    }

    //DELETE method
    public String deleteEmployee(int id){
        repository.deleteById(id);
        return "Employee removed" + id;
    }

    //UPDATE method
    public Employee updateEmployee(Employee employee){
        Employee existingEmployee= repository.findById(employee.getId()).orElse(null);
        existingEmployee.setName(employee.getName());
        existingEmployee.setSurname(employee.getSurname());
        existingEmployee.setCompany(employee.getCompany());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setPhone(employee.getPhone());
        return repository.save(existingEmployee);
    }
}
