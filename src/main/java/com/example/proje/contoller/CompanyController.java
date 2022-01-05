package com.example.proje.contoller;

import com.example.proje.entity.Company;
import com.example.proje.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService service;

    @PostMapping("/addCompany")
    public Company addCompany(@RequestBody Company company){
        return service.saveCompany(company);
    }
    @PostMapping("/addCompanies")
    public List<Company> addCompanies(@RequestBody List<Company> companies){
        return service.saveCompanies(companies);
    }
    @GetMapping("/companies")
    public List<Company> findAllCompanies(){
        return service.getCompanies();
    }
    @GetMapping("/company/{id}")
    public Company findCompanyById(@PathVariable int id){
        return service.getCompanyById(id);
    }
    @GetMapping("/company/{name}")
    public Company findCompanyByName(@PathVariable String name){
        return service.getCompanyByName(name);
    }

    @PutMapping("/updateCompany")
    public Company updateCompany(@RequestBody Company company){
        return service.updateCompany(company);
    }

    @DeleteMapping("/deleteCompany/{id}")
    public String deleteCompany(@PathVariable int id){
        return service.deleteCompany(id);
    }
}
