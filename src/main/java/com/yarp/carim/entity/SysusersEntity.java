package com.yarp.carim.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "sysusers", schema = "carmanger")
public class SysusersEntity {
    private int idsysuser;
    private String username;
    private String password;
    private Date createdate;
    private String role;
    private Integer orgsIdorgs;

    @Id
    @Column(name = "idsysuser")
    public int getIdsysuser() {
        return idsysuser;
    }

    public void setIdsysuser(int idsysuser) {
        this.idsysuser = idsysuser;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "createdate")
    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "orgs_idorgs")
    public Integer getOrgsIdorgs() {
        return orgsIdorgs;
    }

    public void setOrgsIdorgs(Integer orgsIdorgs) {
        this.orgsIdorgs = orgsIdorgs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysusersEntity that = (SysusersEntity) o;
        return idsysuser == that.idsysuser && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(createdate, that.createdate) && Objects.equals(role, that.role) && Objects.equals(orgsIdorgs, that.orgsIdorgs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idsysuser, username, password, createdate, role, orgsIdorgs);
    }
}
