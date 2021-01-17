package com.yarp.carim.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CominsEntityPK implements Serializable {
    private int idCommerceins;
    private int insclassIdinsclass;
    private int carsOwnersIdowners;
    private int carsIdcars;

    @Column(name = "idCommerceins")
    @Id
    public int getIdCommerceins() {
        return idCommerceins;
    }

    public void setIdCommerceins(int idCommerceins) {
        this.idCommerceins = idCommerceins;
    }

    @Column(name = "insclass_idinsclass")
    @Id
    public int getInsclassIdinsclass() {
        return insclassIdinsclass;
    }

    public void setInsclassIdinsclass(int insclassIdinsclass) {
        this.insclassIdinsclass = insclassIdinsclass;
    }

    @Column(name = "cars_owners_idowners")
    @Id
    public int getCarsOwnersIdowners() {
        return carsOwnersIdowners;
    }

    public void setCarsOwnersIdowners(int carsOwnersIdowners) {
        this.carsOwnersIdowners = carsOwnersIdowners;
    }

    @Column(name = "cars_idcars")
    @Id
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
        CominsEntityPK that = (CominsEntityPK) o;
        return idCommerceins == that.idCommerceins && insclassIdinsclass == that.insclassIdinsclass && carsOwnersIdowners == that.carsOwnersIdowners && carsIdcars == that.carsIdcars;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCommerceins, insclassIdinsclass, carsOwnersIdowners, carsIdcars);
    }
}
