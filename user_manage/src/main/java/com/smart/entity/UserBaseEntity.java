package com.smart.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javassist.SerialVersionUID;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@Entity
@Table(name = "user_base", schema = "user_base")
@JsonRootName("user")

public class UserBaseEntity implements Serializable {
    long SerialVersionUID=1l;
    @JsonProperty
    private String id;
    private String name;
    private String userName;
    private Timestamp createTime;
    private Date brithday;
    private String email;
    private Character  numberPhone;
    private String identVard;
    private String sex;
    private String password;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "user_name", nullable = false, length = 45)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "create_time", nullable = false)
    @DateTimeFormat(pattern = "yyyy-mm-dd HH:mm:ss")

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "brithday", nullable = false)
    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 70)
    @JsonBackReference
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "number_phone", nullable = false)
    public Character getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(Character numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Basic
    @Column(name = "ident_vard", nullable = false, length = 18)
    public String getIdentVard() {
        return identVard;
    }

    public void setIdentVard(String identVard) {
        this.identVard = identVard;
    }

    @Basic
    @Column(name = "sex", nullable = false, length = 255)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserBaseEntity that = (UserBaseEntity) o;


        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (brithday != null ? brithday.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + numberPhone;
        result = 31 * result + (identVard != null ? identVard.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
