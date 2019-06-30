package com.smart.entity;

import javax.persistence.*;

@Entity
@Table(name = "role", schema = "user_base", catalog = "")
public class Role  {
    private String id;
    private int normalUser;
    private int admin;
    private int business;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }


    @Basic
    @Column(name = "normal_user", nullable = false)
    public int getNormalUser() {
        return normalUser;
    }


    @Basic
    @Column(name = "admin", nullable = false)
    public int getAdmin() {
        return admin;
    }


    @Basic
    @Column(name = "business", nullable = false)
    public int getBusiness() {
        return business;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role that = (Role) o;


        if (business != that.business) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + normalUser;
        result = 31 * result + admin;
        result = 31 * result + business;
        return result;
    }
}
