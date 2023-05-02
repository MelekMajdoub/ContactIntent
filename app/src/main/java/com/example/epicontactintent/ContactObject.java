package com.example.epicontactintent;

import java.io.Serializable;

public class ContactObject implements Serializable {

    private static final long serialVersionId = 1L;
    private String Name;
    private String Phone;
    private String Email;
    private String Website;

    public ContactObject(String name, String phone, String email, String wensite) {
        Name = name;
        Phone = phone;
        Email = email;
        Website = wensite;
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public String getWebsite() {
        return Website;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setWebsite(String wensite) {
        Website = wensite;
    }
}
