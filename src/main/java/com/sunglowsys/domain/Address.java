package com.sunglowsys.domain;

public class Address {
    private Long addId;
    private String addressLine1;
    private Long HouseNo;
    private Long zipCode;
    private String counrty;

    public Address() {
        System.out.println("address is created");
    }

    public Address(Long addId, String addressLine1, Long houseNo, Long zipCode, String counrty) {
        super();
        this.addId = addId;
        this.addressLine1 = addressLine1;
        HouseNo = houseNo;
        this.zipCode = zipCode;
        this.counrty = counrty;
    }

    public Long getAddId() {
        return addId;
    }

    public void setAddId(Long addId) {
        this.addId = addId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Long getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(Long houseNo) {
        HouseNo = houseNo;
    }

    public Long getZipCode() {
        return zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }

    public String getCounrty() {
        return counrty;
    }

    public void setCounrty(String counrty) {
        this.counrty = counrty;
    }
    public void checkAddress() {
        System.out.println("AddId :" +002L);
        System.out.println("AddressLine1 :"+"husainpur");
        System.out.println("HouseNO :"+32L);
        System.out.println("ZipCode :"+564330L);
        System.out.println("Country:"+"India");

    }
}
