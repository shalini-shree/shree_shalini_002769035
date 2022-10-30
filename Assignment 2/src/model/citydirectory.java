/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class citydirectory {
    
    private ArrayList<City> citylist;
    
    public citydirectory(){
        citylist = new ArrayList<City>();
    }
    
    public void cityhistory() {
        this.citylist = new ArrayList<City>();
    }

    public ArrayList<City> getCitylist() {
        return citylist;
    }

    public void setCitylist(ArrayList<City> citylist) {
        this.citylist = citylist;
    }
    
    public City AddNewCity(){
        City newcity = new City();
        citylist.add(newcity);
        return newcity;
    }
    
    public void deleteCity(City c){
        citylist.remove(c);
    }
}

