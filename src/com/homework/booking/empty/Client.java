package com.homework.booking.empty;

public class Client {

    private String name;
    private String surname;
    private String numberPhone;
    private String email;
    private Bill bill;

    public Client(String name, String surname, String numberPhone, String email, Bill bill) {
        this.name = name;
        this.surname = surname;
        this.numberPhone = numberPhone;
        this.email = email;
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
