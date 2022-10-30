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
    
    public PersonHistory()
    {
        this.personhistory  = new ArrayList<Person>();
        
        Person person = new Person();
        
        person.setUsername("sysadmin");
        person.setPassword("sysadmin");
        person.setPersonid(1);
        personhistory.add(person);
        
        //Test Data
        person = new Person();
        person.setUsername("hospadmin");
        person.setPassword("hospadmin");
        person.setPersonid(2);
        personhistory.add(person);
        
        person = new Person();
        person.setUsername("commadmin");
        person.setPassword("commadmin");
        person.setPersonid(3);
        personhistory.add(person);
        
        person = new Person();
        person.setUsername("doctor");
        person.setPassword("doctor");
        person.setPersonid(4);
        personhistory.add(person);
        
        person = new Person();
        person.setUsername("patient");
        person.setPassword("patient");
        person.setPersonid(5);
        personhistory.add(person);
    }
}
