package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "invoice_products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InvoiceProduct extends BaseEntity{
    private int quantity;
    private BigDecimal price;
    private int tax;
    BigDecimal profitLoss;
    private int remainingQty;
    @ManyToOne
    private Invoice invoice;
    @ManyToOne
    private Product product;

}
