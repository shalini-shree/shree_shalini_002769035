/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author shalini shree
 */
public class House {
    
    private String address;
    private String h_city;
    private String h_community;
    private String h_zipcode;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getH_city() {
        return h_city;
    }

    public void setH_city(String h_city) {
        this.h_city = h_city;
    }

    public String getH_community() {
        return h_community;
    }

    public void setH_community(String h_community) {
        this.h_community = h_community;
    }

    public String getH_zipcode() {
        return h_zipcode;
    }

    public void setH_zipcode(String h_zipcode) {
        this.h_zipcode = h_zipcode;
    }
    @Override
    public String toString(){
        return address;
    }

}
