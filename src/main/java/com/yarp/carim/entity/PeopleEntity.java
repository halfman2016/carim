package com.yarp.carim.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "people", schema = "carmanger")
public class PeopleEntity {
    private int idpeople;
    private String name;
    private String code;
    private String mobile;
    private Integer orgsIdorgs;
    private String addr;

    @Id
    @Column(name = "idpeople")
    public int getIdpeople() {
        return idpeople;
    }

    public void setIdpeople(int idpeople) {
        this.idpeople = idpeople;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "orgs_idorgs")
    public Integer getOrgsIdorgs() {
        return orgsIdorgs;
    }

    public void setOrgsIdorgs(Integer orgsIdorgs) {
        this.orgsIdorgs = orgsIdorgs;
    }

    @Basic
    @Column(name = "addr")
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeopleEntity that = (PeopleEntity) o;
        return idpeople == that.idpeople && Objects.equals(name, that.name) && Objects.equals(code, that.code) && Objects.equals(mobile, that.mobile) && Objects.equals(orgsIdorgs, that.orgsIdorgs) && Objects.equals(addr, that.addr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpeople, name, code, mobile, orgsIdorgs, addr);
    }
}
