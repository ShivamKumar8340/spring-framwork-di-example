package com.sunglowsys.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String mobile;

    @Autowired
    private Address address;


    public Employee() {
        System.out.println("Employee is created");


    }

    public Employee(Long id, String firstName, String lastName, String mobile, Address address) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void newAddress() {
        address.checkAddress();
    }
}
