/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shalinishree
 */
public class doc {
    private String doc_name;
    private int doc_age;
    private String specialist;
    private int work_exp;
    private String d_address;
    private String d_city;
    private int d_zipcode;
    
    public String getAddress_d() {
        return d_address;
    }

    public void setAddress_d(String d_address) {
        this.d_address = d_address;
    }
    
    public String getdoc_name(){
        return doc_name;
    }
    
    public void setdoc_name(String doc_name){
        this.doc_name = doc_name;
    }
    
    public int getdoc_age() {
        return doc_age;
    }

    public void setdoc_Age(int doc_age) {
        this.doc_age = doc_age;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public int getWork_exp() {
        return work_exp;
    }

    public void setWork_exp(int work_exp) {
        this.work_exp = work_exp;
    }

    public String getD_city() {
        return d_city;
    }

    public void setD_city(String d_city) {
        this.d_city = d_city;
    }

    public int getD_zipcode() {
        return d_zipcode;
    }

    public void setD_zipcode(int d_zipcode) {
        this.d_zipcode = d_zipcode;
    }
    
}
