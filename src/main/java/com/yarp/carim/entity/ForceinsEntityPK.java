package com.yarp.carim.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ForceinsEntityPK implements Serializable {
    private int idInsurances;
    private int insclassIdinsclass;
    private int carsIdcars;

    @Column(name = "idInsurances")
    @Id
    public int getIdInsurances() {
        return idInsurances;
    }

    public void setIdInsurances(int idInsurances) {
        this.idInsurances = idInsurances;
    }

    @Column(name = "insclass_idinsclass")
    @Id
    public int getInsclassIdinsclass() {
        return insclassIdinsclass;
    }

    public void setInsclassIdinsclass(int insclassIdinsclass) {
        this.insclassIdinsclass = insclassIdinsclass;
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
        ForceinsEntityPK that = (ForceinsEntityPK) o;
        return idInsurances == that.idInsurances && insclassIdinsclass == that.insclassIdinsclass && carsIdcars == that.carsIdcars;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInsurances, insclassIdinsclass, carsIdcars);
    }
}
