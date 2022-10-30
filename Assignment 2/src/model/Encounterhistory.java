/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class Encounterhistory {
    
    private ArrayList<Encounter> ehistory;
    
    public Encounterhistory() {
        this.ehistory = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEhistory() {
        return ehistory;
    }

    public void setEhistory(ArrayList<Encounter> vhistory) {
        this.ehistory = vhistory;
    }
    
    public Encounter addNewEncounter(){
    
        Encounter newEncounter = new Encounter();
        ehistory.add(newEncounter);
        return newEncounter;
    }
    
    public void deleteEncounter(Encounter vs){
        ehistory.remove(vs);
    }

    

}
