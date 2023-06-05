package com.cydeo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CompanyStatus {

    ACTIVE("Active"), PASSIVE("Passive");

    private final String value;
}
