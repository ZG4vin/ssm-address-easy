package com.gavin.domain;

public class Person {
    private Integer id;
    private String name;
    private String phone;
    private String address;
    private String invalid;

    public Person(Integer id, String name, String phone, String address, String invalid) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.invalid = invalid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInvalid() {
        return invalid;
    }

    public void setInvalid(String invalid) {
        this.invalid = invalid;
    }
}
