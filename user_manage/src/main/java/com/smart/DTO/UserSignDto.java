package com.smart.DTO;

import javassist.SerialVersionUID;

import java.io.Serializable;

public class UserSignDto implements Serializable {
    Long SerialVersionUID=1l;
    private String name;
    private String userName;
    private String email;
    private Long  numberPhone;
    private String identVard;
    private String sex;
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdentVard(String identVard) {
        this.identVard = identVard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberPhone(Long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public UserSignDto(String name,String sex,long number,String email){
        this.email=email;
        this.userName=name;
        this.sex=sex;
        this.numberPhone=number;
    }
}
