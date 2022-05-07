package com.br.bdprojeto.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrderDto {
    
    private int OrderID;
    private String CustomerID;
    private int EmployeeID;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime OrderDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime RequiredDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime ShippedDate;
    private int ShipVia;
    private double Freight;
    private String ShipName; 
    private String ShipAddress;
    private String ShipCity;
    private String ShipRegion;
    private String ShipPostalCode;
    private String ShipCountry;
    
    

    public int getOrderID() {
        return OrderID;
    }
    public void setOrderID(int orderID) {
        OrderID = orderID;
    }
    public String getCustomerID() {
        return CustomerID;
    }
    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }
    public int getEmployeeID() {
        return EmployeeID;
    }
    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }
    public LocalDateTime getOrderDate() {
        return OrderDate;
    }
    public void setOrderDate(LocalDateTime orderDate) {
        OrderDate = orderDate;
    }
    public LocalDateTime getRequiredDate() {
        return RequiredDate;
    }
    public void setRequiredDate(LocalDateTime requiredDate) {
        RequiredDate = requiredDate;
    }
    public LocalDateTime getShippedDate() {
        return ShippedDate;
    }
    public void setShippedDate(LocalDateTime shippedDate) {
        ShippedDate = shippedDate;
    }
    public int getShipVia() {
        return ShipVia;
    }
    public void setShipVia(int shipVia) {
        ShipVia = shipVia;
    }
    public double getFreight() {
        return Freight;
    }
    public void setFreight(double freight) {
        Freight = freight;
    }
    public String getShipName() {
        return ShipName;
    }
    public void setShipName(String shipName) {
        ShipName = shipName;
    }
    public String getShipAddress() {
        return ShipAddress;
    }
    public void setShipAddress(String shipAddress) {
        ShipAddress = shipAddress;
    }
    public String getShipCity() {
        return ShipCity;
    }
    public void setShipCity(String shipCity) {
        ShipCity = shipCity;
    }
    public String getShipRegion() {
        return ShipRegion;
    }
    public void setShipRegion(String shipRegion) {
        ShipRegion = shipRegion;
    }
    public String getShipPostalCode() {
        return ShipPostalCode;
    }
    public void setShipPostalCode(String shipPostalCode) {
        ShipPostalCode = shipPostalCode;
    }
    public String getShipCountry() {
        return ShipCountry;
    }
    public void setShipCountry(String shipCountry) {
        ShipCountry = shipCountry;
    }

    
}
