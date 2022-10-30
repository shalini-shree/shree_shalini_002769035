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
public class HospitalDirectory {
    
    private ArrayList<Hospital> hosphistory;
    
    public HospitalDirectory(){
        hosphistory = new ArrayList<Hospital>();
    }
    
    public void HospitalHistory() {
        this.hosphistory = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHosphistory() {
        return hosphistory;
    }

    public void setHosphistory(ArrayList<Hospital> hosphistory) {
        this.hosphistory = hosphistory;
    }

    public Hospital addNewHospital(){
    
        Hospital newhospital = new Hospital();
        hosphistory.add(newhospital);
        return newhospital;
    }
    
    public void deleteHospital(Hospital hs){
        hosphistory.remove(hs);
    }
    

}
