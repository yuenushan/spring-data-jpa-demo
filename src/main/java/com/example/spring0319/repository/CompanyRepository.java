package com.example.spring0319.repository;

import com.example.spring0319.entiry.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Integer> {
}
