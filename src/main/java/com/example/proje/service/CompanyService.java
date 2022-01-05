package com.example.proje.service;

import com.example.proje.entity.Company;
import com.example.proje.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository repository;

    //POST methods
    public Company saveCompany(Company company){
        return repository.save(company);
    }
    public List<Company> saveCompanies(List<Company> companies){
        return repository.saveAll(companies);
    }

    //GET methods
    public List<Company> getCompanies(){
        return repository.findAll();
    }
    public Company getCompanyById(int id){
        return repository.findById(id).orElse(null);
    }
    public Company getCompanyByName(String name){
        return repository.findByName(name);
    }

    //DELETE method
    public String deleteCompany(int id){
        repository.deleteById(id);
        return "Company removed" + id;
    }

    //UPDATE method
    public Company updateCompany(Company company){
        Company existingCompany= repository.findById(company.getId()).orElse(null);
        existingCompany.setName(company.getName());
        existingCompany.setCity(company.getCity());
        existingCompany.setYear(company.getYear());
        existingCompany.setEmployees(company.getEmployees());
        return repository.save(existingCompany);
    }

}
