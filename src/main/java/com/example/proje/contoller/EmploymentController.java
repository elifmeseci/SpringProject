package com.example.proje.contoller;

import com.example.proje.dto.InputRequest;
import com.example.proje.entity.Company;
import com.example.proje.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmploymentController {

    @Autowired
    private CompanyRepository companyRepository;

    @PostMapping("/placeInput")
    public Company placeInput(@RequestBody InputRequest request){
        return companyRepository.save(request.getCompany());
    }

    @GetMapping("/findAllInputs")
    public List<Company> findAllInputs(){
        return companyRepository.findAll();
    }

    @GetMapping("/getInfo")
    public String getJoinInformation(){
        return companyRepository.getJoinInformation();
    }
}
