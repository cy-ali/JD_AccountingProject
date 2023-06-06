package com.cydeo.entity;

import com.cydeo.enums.ClientVendorType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "clients_vendors")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientVendor extends BaseEntity{
    private String clientVendorName;
    private String phone;
    private String website;
    @Enumerated(EnumType.STRING)
    private ClientVendorType clientVendorType;
    @OneToOne
    private Address address;
    @ManyToOne
    private Company company;
}
