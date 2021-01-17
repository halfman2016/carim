package com.yarp.carim.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TestrecEntityPK implements Serializable {
    private int idtestrec;
    private int carsIdcars;

    @Column(name = "idtestrec")
    @Id
    public int getIdtestrec() {
        return idtestrec;
    }

    public void setIdtestrec(int idtestrec) {
        this.idtestrec = idtestrec;
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
        TestrecEntityPK that = (TestrecEntityPK) o;
        return idtestrec == that.idtestrec && carsIdcars == that.carsIdcars;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtestrec, carsIdcars);
    }
}
