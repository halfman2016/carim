package com.yarp.carim.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "insclass", schema = "carmanger")
public class InsclassEntity {
    private int idinsclass;
    private String insname;
    private String inscorp;
    private String instype;
    private String corpaddr;
    private String corppostcode;
    private String corptele;

    @Id
    @Column(name = "idinsclass")
    public int getIdinsclass() {
        return idinsclass;
    }

    public void setIdinsclass(int idinsclass) {
        this.idinsclass = idinsclass;
    }

    @Basic
    @Column(name = "insname")
    public String getInsname() {
        return insname;
    }

    public void setInsname(String insname) {
        this.insname = insname;
    }

    @Basic
    @Column(name = "inscorp")
    public String getInscorp() {
        return inscorp;
    }

    public void setInscorp(String inscorp) {
        this.inscorp = inscorp;
    }

    @Basic
    @Column(name = "instype")
    public String getInstype() {
        return instype;
    }

    public void setInstype(String instype) {
        this.instype = instype;
    }

    @Basic
    @Column(name = "corpaddr")
    public String getCorpaddr() {
        return corpaddr;
    }

    public void setCorpaddr(String corpaddr) {
        this.corpaddr = corpaddr;
    }

    @Basic
    @Column(name = "corppostcode")
    public String getCorppostcode() {
        return corppostcode;
    }

    public void setCorppostcode(String corppostcode) {
        this.corppostcode = corppostcode;
    }

    @Basic
    @Column(name = "corptele")
    public String getCorptele() {
        return corptele;
    }

    public void setCorptele(String corptele) {
        this.corptele = corptele;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InsclassEntity that = (InsclassEntity) o;
        return idinsclass == that.idinsclass && Objects.equals(insname, that.insname) && Objects.equals(inscorp, that.inscorp) && Objects.equals(instype, that.instype) && Objects.equals(corpaddr, that.corpaddr) && Objects.equals(corppostcode, that.corppostcode) && Objects.equals(corptele, that.corptele);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idinsclass, insname, inscorp, instype, corpaddr, corppostcode, corptele);
    }
}
