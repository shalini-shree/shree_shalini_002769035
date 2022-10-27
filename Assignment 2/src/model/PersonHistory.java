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
public class PersonHistory{
    
    private ArrayList<Person> personhistory;
    
    
//    public PersonHistory() {
//        this.phistory = new ArrayList<Person>();
//    }

    public ArrayList<Person> getPhistory() {
        return personhistory;
    }

    public void setPhistory(ArrayList<Person> phistory) {
        this.personhistory = phistory;
    }
    
    public Person addNewPersons(){
    
        Person newPerson = new Person();
        personhistory.add(newPerson);
        return newPerson;
    }
    
    public void deletePerson(Person p){
        personhistory.remove(p);
    }
    
}
