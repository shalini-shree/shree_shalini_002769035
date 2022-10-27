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
public class SystemFiles {
    
    PersonHistory personHist = new PersonHistory();
    PatientDirectory pdirectory = new PatientDirectory();
    City c = new City();

    public PersonHistory getPersonHist() {
        return personHist;
    }
    
    public ArrayList<Person> getPersonHistoryList() {
        return personHist.getPhistory();
    }

    public void setPersonHist(PersonHistory personHist) {
        this.personHist = personHist;
    }

    public PatientDirectory getPdirectory() {
        return pdirectory;
    }

    public void setPdirectory(PatientDirectory pdirectory) {
        this.pdirectory = pdirectory;
    }

    public City getC() {
        return c;
    }

    public void setC(City c) {
        this.c = c;
    }
}
