/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shalini shree
 */
public class PatientDirectory {
    
    private ArrayList<Patient> phistory= new ArrayList<Patient>();;
        
    public Patient addNewPatient(){
    
        Patient newPatient = new Patient();
        phistory.add(newPatient);
        return newPatient;
    }

    public ArrayList<Patient> getphistory() {
        return phistory;
    }

    public void setphistory(ArrayList<Patient> phistory) {
        this.phistory = phistory;
    }
    
    
    public void deletePatient(Patient ph){
        phistory.remove(ph);
    }
    
}
