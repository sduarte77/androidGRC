package com.example.otic.prueba2.data;

import java.io.Serializable;

/**
 * Created by sduarte on 30/11/2016.
 */

public class UserModel implements Serializable {

    //se declara el mismo modelo del webservice en sus respuestas
    private String id;
    private String first_name;
    private String last_name;
    private String gender;
    private String birth_date;
    private String email;

    public UserModel(String id, String first_name, String last_name, String gender, String birth_date, String email) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.birth_date = birth_date;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
