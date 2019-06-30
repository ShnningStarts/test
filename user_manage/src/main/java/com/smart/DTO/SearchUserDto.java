package com.smart.DTO;

import javassist.SerialVersionUID;

import java.io.Serializable;

public class SearchUserDto implements Serializable {
    Long SerialVersionUID=1l;
    private String id;
    private String name;
    private String userName;
    private String email;
    private Integer numberPhone;

    public Integer getNumberPhone() {
        return numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public boolean equals(SearchUserDto obj) {

        if(obj.id==this.id){
            return true;
        }return false;
    }
}
