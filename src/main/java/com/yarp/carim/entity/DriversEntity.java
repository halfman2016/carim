package com.yarp.carim.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "drivers", schema = "carmanger")
public class DriversEntity {
    private int iddriver;
    private String name;
    private String licenseno;
    private Date applydate;
    private Integer peopleIdpeople;

    @Id
    @Column(name = "iddriver")
    public int getIddriver() {
        return iddriver;
    }

    public void setIddriver(int iddriver) {
        this.iddriver = iddriver;
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
    @Column(name = "licenseno")
    public String getLicenseno() {
        return licenseno;
    }

    public void setLicenseno(String licenseno) {
        this.licenseno = licenseno;
    }

    @Basic
    @Column(name = "applydate")
    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    @Basic
    @Column(name = "people_idpeople")
    public Integer getPeopleIdpeople() {
        return peopleIdpeople;
    }

    public void setPeopleIdpeople(Integer peopleIdpeople) {
        this.peopleIdpeople = peopleIdpeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriversEntity that = (DriversEntity) o;
        return iddriver == that.iddriver && Objects.equals(name, that.name) && Objects.equals(licenseno, that.licenseno) && Objects.equals(applydate, that.applydate) && Objects.equals(peopleIdpeople, that.peopleIdpeople);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iddriver, name, licenseno, applydate, peopleIdpeople);
    }
}
