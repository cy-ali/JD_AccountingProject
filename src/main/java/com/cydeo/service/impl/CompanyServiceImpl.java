package com.cydeo.service.impl;

import com.cydeo.dto.CompanyDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.entity.Company;
import com.cydeo.mapper.MapperUtil;
import com.cydeo.repository.CompanyRepository;
import com.cydeo.service.CompanyService;
import com.cydeo.service.SecurityService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;
    private final MapperUtil modelUtil;
    private final SecurityService securityService;

    public CompanyServiceImpl(CompanyRepository companyRepository, MapperUtil modelUtil, SecurityService securityService) {
        this.companyRepository = companyRepository;
        this.modelUtil = modelUtil;
        this.securityService = securityService;
    }

    @Override
    public CompanyDTO getCompanyDtoByLoggedInUser() {
        UserDTO loggedInUser = securityService.getLoggedInUser();
        Company company = companyRepository.findById(loggedInUser.getCompany().getId()).orElseThrow(() -> new NoSuchElementException("There is no such a Company with this id: " + 1L));
        return modelUtil.convert(company, new CompanyDTO());
    }
}
