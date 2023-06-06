package com.cydeo.dto;

import com.cydeo.enums.ProductUnit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDTO {
    Long id;
    private String name;
    private int quantityInStock;
    private int lowLimitAlert;
    private ProductUnit productUnit;
    private CategoryDTO category;
}
