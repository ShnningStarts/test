package com.smart.entity;

import javassist.SerialVersionUID;
import org.hibernate.cfg.DefaultNamingStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "address", schema = "user_base", catalog = "")
public class AddressEntity implements Serializable {

    Long SerialVersionUID=1l;
    private String id;
    private Timestamp createTime;
    private Timestamp deleteTime;
    private Integer  reTelephone;
    private Integer sendTelephone;
    private String coutry;
    private String city;
    private String provice;
    private String area;
    private String detailAdd;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "create_time", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "delete_time", nullable = false)
    public Timestamp getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Timestamp deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Basic
    @Column(name = "re_telephone", nullable = false)
    public int getReTelephone() {
        return reTelephone;
    }

    public void setReTelephone(int reTelephone) {
        this.reTelephone = reTelephone;
    }

    @Basic
    @Column(name = "send_telephone", nullable = false)
    public int getSendTelephone() {
        return sendTelephone;
    }

    public void setSendTelephone(int sendTelephone) {
        this.sendTelephone = sendTelephone;
    }

    @Basic
    @Column(name = "coutry", nullable = false, length = 32)
    public String getCoutry() {
        return coutry;
    }

    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 32)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "provice", nullable = false, length = 32)
    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    @Basic
    @Column(name = "area", nullable = false, length = 32)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "detail_add", nullable = false, length = 255)
    public String getDetailAdd() {
        return detailAdd;
    }

    public void setDetailAdd(String detailAdd) {
        this.detailAdd = detailAdd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (deleteTime != null ? deleteTime.hashCode() : 0);
        result = 31 * result + reTelephone;
        result = 31 * result + sendTelephone;
        result = 31 * result + (coutry != null ? coutry.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (provice != null ? provice.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (detailAdd != null ? detailAdd.hashCode() : 0);
        return result;
    }
}
