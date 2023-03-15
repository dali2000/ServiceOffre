package com.iset.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Offre {
    @Id
    @GeneratedValue
    private long code;
    private String intuitive;
    private String speciality;
    private String societe;
    private int postpones;
    private String pays;

    public Offre(){
        super();
    }
    public Offre(String intuitive, String speciality, String societe, int postpones, String pays){
        this.code = code;
        this.intuitive= intuitive;
        this.speciality = speciality;
        this.societe = societe;
        this.postpones = postpones;
        this.pays = pays;
    }


    public String getIntuitive() {
        return intuitive;
    }

    public void setIntuitive(String intuitive) {
        this.intuitive = intuitive;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public int getPostpones() {
        return postpones;
    }

    public void setPostpones(int postpones) {
        this.postpones = postpones;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
