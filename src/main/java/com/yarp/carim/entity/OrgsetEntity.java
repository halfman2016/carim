package com.yarp.carim.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orgset", schema = "carmanger")
public class OrgsetEntity {
    private Integer days;
    private String sms;
    private int orgsIdorgs;

    @Basic
    @Column(name = "days")
    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    @Basic
    @Column(name = "sms")
    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    @Id
    @Column(name = "orgs_idorgs")
    public int getOrgsIdorgs() {
        return orgsIdorgs;
    }

    public void setOrgsIdorgs(int orgsIdorgs) {
        this.orgsIdorgs = orgsIdorgs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrgsetEntity that = (OrgsetEntity) o;
        return orgsIdorgs == that.orgsIdorgs && Objects.equals(days, that.days) && Objects.equals(sms, that.sms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, sms, orgsIdorgs);
    }
}
