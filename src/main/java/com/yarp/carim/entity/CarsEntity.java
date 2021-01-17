package com.yarp.carim.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "cars", schema = "carmanger")
public class CarsEntity {
    private int idcars;
    private String carplate;
    private String cartype;
    private String caraddress;
    private String caruae;
    private String carbrand;
    private String carvin;
    private String carengine;
    private Date regdate;
    private Date applydate;
    private String filenum;
    private String carcarry;
    private String carmass;
    private String carcarrymass;
    private String caremass;
    private String carappeara;
    private Date carscrapdate;
    private String carfule;
    private String papercode;
    private int ownersIdowners;
    private int orgsIdorgs;

    @Id
    @Column(name = "idcars")
    public int getIdcars() {
        return idcars;
    }

    public void setIdcars(int idcars) {
        this.idcars = idcars;
    }

    @Basic
    @Column(name = "carplate")
    public String getCarplate() {
        return carplate;
    }

    public void setCarplate(String carplate) {
        this.carplate = carplate;
    }

    @Basic
    @Column(name = "cartype")
    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    @Basic
    @Column(name = "caraddress")
    public String getCaraddress() {
        return caraddress;
    }

    public void setCaraddress(String caraddress) {
        this.caraddress = caraddress;
    }

    @Basic
    @Column(name = "caruae")
    public String getCaruae() {
        return caruae;
    }

    public void setCaruae(String caruae) {
        this.caruae = caruae;
    }

    @Basic
    @Column(name = "carbrand")
    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    @Basic
    @Column(name = "carvin")
    public String getCarvin() {
        return carvin;
    }

    public void setCarvin(String carvin) {
        this.carvin = carvin;
    }

    @Basic
    @Column(name = "carengine")
    public String getCarengine() {
        return carengine;
    }

    public void setCarengine(String carengine) {
        this.carengine = carengine;
    }

    @Basic
    @Column(name = "regdate")
    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
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
    @Column(name = "filenum")
    public String getFilenum() {
        return filenum;
    }

    public void setFilenum(String filenum) {
        this.filenum = filenum;
    }

    @Basic
    @Column(name = "carcarry")
    public String getCarcarry() {
        return carcarry;
    }

    public void setCarcarry(String carcarry) {
        this.carcarry = carcarry;
    }

    @Basic
    @Column(name = "carmass")
    public String getCarmass() {
        return carmass;
    }

    public void setCarmass(String carmass) {
        this.carmass = carmass;
    }

    @Basic
    @Column(name = "carcarrymass")
    public String getCarcarrymass() {
        return carcarrymass;
    }

    public void setCarcarrymass(String carcarrymass) {
        this.carcarrymass = carcarrymass;
    }

    @Basic
    @Column(name = "caremass")
    public String getCaremass() {
        return caremass;
    }

    public void setCaremass(String caremass) {
        this.caremass = caremass;
    }

    @Basic
    @Column(name = "carappeara")
    public String getCarappeara() {
        return carappeara;
    }

    public void setCarappeara(String carappeara) {
        this.carappeara = carappeara;
    }

    @Basic
    @Column(name = "carscrapdate")
    public Date getCarscrapdate() {
        return carscrapdate;
    }

    public void setCarscrapdate(Date carscrapdate) {
        this.carscrapdate = carscrapdate;
    }

    @Basic
    @Column(name = "carfule")
    public String getCarfule() {
        return carfule;
    }

    public void setCarfule(String carfule) {
        this.carfule = carfule;
    }

    @Basic
    @Column(name = "papercode")
    public String getPapercode() {
        return papercode;
    }

    public void setPapercode(String papercode) {
        this.papercode = papercode;
    }

    @Basic
    @Column(name = "owners_idowners")
    public int getOwnersIdowners() {
        return ownersIdowners;
    }

    public void setOwnersIdowners(int ownersIdowners) {
        this.ownersIdowners = ownersIdowners;
    }

    @Basic
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
        CarsEntity that = (CarsEntity) o;
        return idcars == that.idcars && ownersIdowners == that.ownersIdowners && orgsIdorgs == that.orgsIdorgs && Objects.equals(carplate, that.carplate) && Objects.equals(cartype, that.cartype) && Objects.equals(caraddress, that.caraddress) && Objects.equals(caruae, that.caruae) && Objects.equals(carbrand, that.carbrand) && Objects.equals(carvin, that.carvin) && Objects.equals(carengine, that.carengine) && Objects.equals(regdate, that.regdate) && Objects.equals(applydate, that.applydate) && Objects.equals(filenum, that.filenum) && Objects.equals(carcarry, that.carcarry) && Objects.equals(carmass, that.carmass) && Objects.equals(carcarrymass, that.carcarrymass) && Objects.equals(caremass, that.caremass) && Objects.equals(carappeara, that.carappeara) && Objects.equals(carscrapdate, that.carscrapdate) && Objects.equals(carfule, that.carfule) && Objects.equals(papercode, that.papercode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcars, carplate, cartype, caraddress, caruae, carbrand, carvin, carengine, regdate, applydate, filenum, carcarry, carmass, carcarrymass, caremass, carappeara, carscrapdate, carfule, papercode, ownersIdowners, orgsIdorgs);
    }
}
