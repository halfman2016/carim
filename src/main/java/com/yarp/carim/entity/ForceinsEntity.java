package com.yarp.carim.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "forceins", schema = "carmanger")
@IdClass(ForceinsEntityPK.class)
public class ForceinsEntity {
    private int idInsurances;
    private int insclassIdinsclass;
    private Integer deathinde;
    private Integer medinde;
    private Integer proinde;
    private Integer nrdeathinde;
    private Integer nrmedinde;
    private Integer nrproinde;
    private Double premium;
    private Date startdate;
    private Double floatratio;
    private Date enddate;
    private String dispute;
    private Double payty;
    private Double paypy;
    private Double lpf;
    private Double ttax;
    private Date signdate;
    private String underwriting;
    private String manufacturing;
    private String handle;
    private String ponum;
    private int carsIdcars;

    @Id
    @Column(name = "idInsurances")
    public int getIdInsurances() {
        return idInsurances;
    }

    public void setIdInsurances(int idInsurances) {
        this.idInsurances = idInsurances;
    }

    @Id
    @Column(name = "insclass_idinsclass")
    public int getInsclassIdinsclass() {
        return insclassIdinsclass;
    }

    public void setInsclassIdinsclass(int insclassIdinsclass) {
        this.insclassIdinsclass = insclassIdinsclass;
    }

    @Basic
    @Column(name = "deathinde")
    public Integer getDeathinde() {
        return deathinde;
    }

    public void setDeathinde(Integer deathinde) {
        this.deathinde = deathinde;
    }

    @Basic
    @Column(name = "medinde")
    public Integer getMedinde() {
        return medinde;
    }

    public void setMedinde(Integer medinde) {
        this.medinde = medinde;
    }

    @Basic
    @Column(name = "proinde")
    public Integer getProinde() {
        return proinde;
    }

    public void setProinde(Integer proinde) {
        this.proinde = proinde;
    }

    @Basic
    @Column(name = "nrdeathinde")
    public Integer getNrdeathinde() {
        return nrdeathinde;
    }

    public void setNrdeathinde(Integer nrdeathinde) {
        this.nrdeathinde = nrdeathinde;
    }

    @Basic
    @Column(name = "nrmedinde")
    public Integer getNrmedinde() {
        return nrmedinde;
    }

    public void setNrmedinde(Integer nrmedinde) {
        this.nrmedinde = nrmedinde;
    }

    @Basic
    @Column(name = "nrproinde")
    public Integer getNrproinde() {
        return nrproinde;
    }

    public void setNrproinde(Integer nrproinde) {
        this.nrproinde = nrproinde;
    }

    @Basic
    @Column(name = "premium")
    public Double getPremium() {
        return premium;
    }

    public void setPremium(Double premium) {
        this.premium = premium;
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
    @Column(name = "floatratio")
    public Double getFloatratio() {
        return floatratio;
    }

    public void setFloatratio(Double floatratio) {
        this.floatratio = floatratio;
    }

    @Basic
    @Column(name = "enddate")
    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "dispute")
    public String getDispute() {
        return dispute;
    }

    public void setDispute(String dispute) {
        this.dispute = dispute;
    }

    @Basic
    @Column(name = "payty")
    public Double getPayty() {
        return payty;
    }

    public void setPayty(Double payty) {
        this.payty = payty;
    }

    @Basic
    @Column(name = "paypy")
    public Double getPaypy() {
        return paypy;
    }

    public void setPaypy(Double paypy) {
        this.paypy = paypy;
    }

    @Basic
    @Column(name = "lpf")
    public Double getLpf() {
        return lpf;
    }

    public void setLpf(Double lpf) {
        this.lpf = lpf;
    }

    @Basic
    @Column(name = "ttax")
    public Double getTtax() {
        return ttax;
    }

    public void setTtax(Double ttax) {
        this.ttax = ttax;
    }

    @Basic
    @Column(name = "signdate")
    public Date getSigndate() {
        return signdate;
    }

    public void setSigndate(Date signdate) {
        this.signdate = signdate;
    }

    @Basic
    @Column(name = "underwriting")
    public String getUnderwriting() {
        return underwriting;
    }

    public void setUnderwriting(String underwriting) {
        this.underwriting = underwriting;
    }

    @Basic
    @Column(name = "Manufacturing")
    public String getManufacturing() {
        return manufacturing;
    }

    public void setManufacturing(String manufacturing) {
        this.manufacturing = manufacturing;
    }

    @Basic
    @Column(name = "handle")
    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Basic
    @Column(name = "ponum")
    public String getPonum() {
        return ponum;
    }

    public void setPonum(String ponum) {
        this.ponum = ponum;
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
        ForceinsEntity that = (ForceinsEntity) o;
        return idInsurances == that.idInsurances && insclassIdinsclass == that.insclassIdinsclass && carsIdcars == that.carsIdcars && Objects.equals(deathinde, that.deathinde) && Objects.equals(medinde, that.medinde) && Objects.equals(proinde, that.proinde) && Objects.equals(nrdeathinde, that.nrdeathinde) && Objects.equals(nrmedinde, that.nrmedinde) && Objects.equals(nrproinde, that.nrproinde) && Objects.equals(premium, that.premium) && Objects.equals(startdate, that.startdate) && Objects.equals(floatratio, that.floatratio) && Objects.equals(enddate, that.enddate) && Objects.equals(dispute, that.dispute) && Objects.equals(payty, that.payty) && Objects.equals(paypy, that.paypy) && Objects.equals(lpf, that.lpf) && Objects.equals(ttax, that.ttax) && Objects.equals(signdate, that.signdate) && Objects.equals(underwriting, that.underwriting) && Objects.equals(manufacturing, that.manufacturing) && Objects.equals(handle, that.handle) && Objects.equals(ponum, that.ponum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInsurances, insclassIdinsclass, deathinde, medinde, proinde, nrdeathinde, nrmedinde, nrproinde, premium, startdate, floatratio, enddate, dispute, payty, paypy, lpf, ttax, signdate, underwriting, manufacturing, handle, ponum, carsIdcars);
    }
}
