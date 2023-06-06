package com.cydeo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InvoiceProductDTO {
    private Long id;
    private int quantity;
    private BigDecimal price;
    private int tax;
    BigDecimal profitLoss;
    private int remainingQty;
    private InvoiceDTO invoice;
    private ProductDTO product;
}
