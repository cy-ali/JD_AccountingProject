package com.cydeo.dto;

import com.cydeo.entity.Address;
import com.cydeo.enums.CompanyStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CompanyDTO {
    private Long id;
    private String title;
    private String phone;
    private String website;
    private CompanyStatus companyStatus;
    private Address address;
}
