package com.example.proje.repository;

import com.example.proje.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CompanyRepository extends JpaRepository<Company,Integer> /*company sınıfındaki id integer*/{

    @Query("SELECT c.name, e.name FROM Company c JOIN c.employees e")
    public String getJoinInformation();

    Company findByName(String name);
}
