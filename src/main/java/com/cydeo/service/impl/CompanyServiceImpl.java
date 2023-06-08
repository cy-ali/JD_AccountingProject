package com.cydeo.service.impl;

import com.cydeo.dto.CompanyDTO;
import com.cydeo.entity.Company;
import com.cydeo.mapper.MapperUtil;
import com.cydeo.repository.CompanyRepository;
import com.cydeo.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;
    private final MapperUtil modelUtil;

    public CompanyServiceImpl(CompanyRepository companyRepository, MapperUtil modelUtil) {
        this.companyRepository = companyRepository;
        this.modelUtil = modelUtil;
    }

    @Override
    public CompanyDTO getCompanyDtoByLoggedInUser() {
        //TODO get logged-in user once security added.
        Company company = companyRepository.findById(1L).orElseThrow(() -> new NoSuchElementException("There is no such a Company with this id: " + 1L));
        return modelUtil.convert(company, new CompanyDTO());
    }
}
