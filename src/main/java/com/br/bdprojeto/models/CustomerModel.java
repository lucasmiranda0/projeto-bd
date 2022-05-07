package com.br.bdprojeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class CustomerModel {
    
    @Id    
    private String CustomerID;
    @Column
    private String CompanyName;
    @Column(nullable = true)
    private String ContactName;
    @Column(nullable = true)
    private String ContactTitle;
    @Column(nullable = true)
    private String Address;
    @Column(nullable = true)
    private String City;
    @Column(nullable = true)
    private String Region;
    @Column(nullable = true)
    private String PostalCode;
    @Column(nullable = true)
    private String Country;
    @Column(nullable = true)
    private String Phone;
    @Column(nullable = true)
    private String Fax;
    
    public String getCustomerID() {
        return CustomerID;
    }
    
    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }
    
    public String getCompanyName() {
        return CompanyName;
    }
    
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }
    
    public String getContactName() {
        return ContactName;
    }
    
    public void setContactName(String contactName) {
        ContactName = contactName;
    }
    
    public String getContactTitle() {
        return ContactTitle;
    }
    
    public void setContactTitle(String contactTitle) {
        ContactTitle = contactTitle;
    }
    
    public String getAddress() {
        return Address;
    }
    
    public void setAddress(String address) {
        Address = address;
    }
    
    public String getCity() {
        return City;
    }
    
    public void setCity(String city) {
        City = city;
    }
    
    public String getRegion() {
        return Region;
    }
    
    public void setRegion(String region) {
        Region = region;
    }
    
    public String getPostalCode() {
        return PostalCode;
    }
    
    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }
    
    public String getCountry() {
        return Country;
    }
    
    public void setCountry(String country) {
        Country = country;
    }
    
    public String getPhone() {
        return Phone;
    }
    
    public void setPhone(String phone) {
        Phone = phone;
    }
    
    public String getFax() {
        return Fax;
    }
    
    public void setFax(String fax) {
        Fax = fax;
    }
    
    
}