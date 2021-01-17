package com.yarp.carim.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "testrec", schema = "carmanger")
@IdClass(TestrecEntityPK.class)
public class TestrecEntity {
    private int idtestrec;
    private Date testdate;
    private Date exdate;
    private int carsIdcars;

    @Id
    @Column(name = "idtestrec")
    public int getIdtestrec() {
        return idtestrec;
    }

    public void setIdtestrec(int idtestrec) {
        this.idtestrec = idtestrec;
    }

    @Basic
    @Column(name = "testdate")
    public Date getTestdate() {
        return testdate;
    }

    public void setTestdate(Date testdate) {
        this.testdate = testdate;
    }

    @Basic
    @Column(name = "exdate")
    public Date getExdate() {
        return exdate;
    }

    public void setExdate(Date exdate) {
        this.exdate = exdate;
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
        TestrecEntity that = (TestrecEntity) o;
        return idtestrec == that.idtestrec && carsIdcars == that.carsIdcars && Objects.equals(testdate, that.testdate) && Objects.equals(exdate, that.exdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtestrec, testdate, exdate, carsIdcars);
    }
}
