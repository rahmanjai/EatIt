package com.proyek.rahmanjai.eatit.Model;

/**
 * Created by rahmanjai on 30/03/2018.
 */

public class User {
    private String Nama;
    private String Password;
    private String Phone;

    public User() {

    }

    public User(String nama, String password) {
        Nama = nama;
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
