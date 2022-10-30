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
public class Housedirectory {
    private ArrayList<House> houselist;
    
    public Housedirectory(){
        houselist = new ArrayList<House>();
    }
    
    public void househistory() {
        this.houselist = new ArrayList<House>();
    }

    public ArrayList<House> gethouselist() {
        return houselist;
    }

    public void sethouselist(ArrayList<House> houselist) {
        this.houselist = houselist;
    }
    
    public House AddNewhouse(){
        House newhouse = new House();
        houselist.add(newhouse);
        return newhouse;
    }
    
    public void deleteHouse(House house){
        houselist.remove(house);
    }
}
