package com.yarp.carim.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "comins", schema = "carmanger")
@IdClass(CominsEntityPK.class)
public class CominsEntity {
    private int idCommerceins;
    private Integer amount;
    private String ponum;
    private Date startdate;
    private Date enddate;
    private int insclassIdinsclass;
    private int carsOwnersIdowners;
    private int carsIdcars;

    @Id
    @Column(name = "idCommerceins")
    public int getIdCommerceins() {
        return idCommerceins;
    }

    public void setIdCommerceins(int idCommerceins) {
        this.idCommerceins = idCommerceins;
    }

    @Basic
    @Column(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "ponum")
    public String getPonum() {
        return ponum;
    }

    public void setPonum(String ponum) {
        this.ponum = ponum;
    }

    @Basic
    @Column(name = "startdate")
    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    @Basic
    @Column(name = "enddate")
    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Id
    @Column(name = "insclass_idinsclass")
    public int getInsclassIdinsclass() {
        return insclassIdinsclass;
    }

    public void setInsclassIdinsclass(int insclassIdinsclass) {
        this.insclassIdinsclass = insclassIdinsclass;
    }

    @Id
    @Column(name = "cars_owners_idowners")
    public int getCarsOwnersIdowners() {
        return carsOwnersIdowners;
    }

    public void setCarsOwnersIdowners(int carsOwnersIdowners) {
        this.carsOwnersIdowners = carsOwnersIdowners;
    }

    @Id
    @Column(name = "cars_idcars")
    public int getCarsIdcars() {
        return carsIdcars;
    }

    public void setCarsIdcars(int carsIdcars) {
        this.carsIdcars = carsIdcars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CominsEntity that = (CominsEntity) o;
        return idCommerceins == that.idCommerceins && insclassIdinsclass == that.insclassIdinsclass && carsOwnersIdowners == that.carsOwnersIdowners && carsIdcars == that.carsIdcars && Objects.equals(amount, that.amount) && Objects.equals(ponum, that.ponum) && Objects.equals(startdate, that.startdate) && Objects.equals(enddate, that.enddate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCommerceins, amount, ponum, startdate, enddate, insclassIdinsclass, carsOwnersIdowners, carsIdcars);
    }
}
