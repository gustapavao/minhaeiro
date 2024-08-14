package com.pavao.minhaeiro.models;

public class Account {
    private int Id;
    private String name;
    private String email;
    private String password;
    private String birthday;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String country;

    Account(String name, String email, String password, String birthday, String phone,
            String address, String city, String state, String country) {
        this.Id = (int) Math.floor(Math.random() * 100);
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    Account(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}