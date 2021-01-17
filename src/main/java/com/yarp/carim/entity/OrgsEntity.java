package com.yarp.carim.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orgs", schema = "carmanger")
public class OrgsEntity {
    private int idorgs;
    private String name;
    private String code;
    private String addr;

    @Id
    @Column(name = "idorgs")
    public int getIdorgs() {
        return idorgs;
    }

    public void setIdorgs(int idorgs) {
        this.idorgs = idorgs;
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
        OrgsEntity that = (OrgsEntity) o;
        return idorgs == that.idorgs && Objects.equals(name, that.name) && Objects.equals(code, that.code) && Objects.equals(addr, that.addr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idorgs, name, code, addr);
    }
}
