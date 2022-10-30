/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author shalinishree
 */
public class Encounter {
    
    private String e_pname;
    private String e_dname;
    private String bloodPressure;
    private String pulserate;
    private Date date;
    private String height;
    private String weight;
    private String Hospital;

    public String getE_pname() {
        return e_pname;
    }

    public void setE_pname(String e_pname) {
        this.e_pname = e_pname;
    }

    public String getE_dname() {
        return e_dname;
    }

    public void setE_dname(String e_dname) {
        this.e_dname = e_dname;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getPulserate() {
        return pulserate;
    }

    public void setPulserate(String pulserate) {
        this.pulserate = pulserate;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    @Override
    public String toString(){
        return e_pname;
    }

    
}
