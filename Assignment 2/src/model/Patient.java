/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author shalinishree
 */
public class Patient {
   
    private String pname;
    private int age;
    private String address;
    private String city;
    private int zipcode;
    private String Number;
    private String pcommunity;

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        this.Number = number;
    }
   
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getPcommunity() {
        return pcommunity;
    }

    public void setPcommunity(String pcommunity) {
        this.pcommunity = pcommunity;
    }
    
    
    @Override
    public String toString(){
        return pname;
    }
    
}
