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
public class Communitydirectory {
    private ArrayList<Community> commlist;
    
    public Communitydirectory(){
        commlist = new ArrayList<Community>();
    }
    
    public void commhistory() {
        this.commlist = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommlist() {
        return commlist;
    }

    public void setCommlist(ArrayList<Community> commlist) {
        this.commlist = commlist;
    }
    
    public Community AddNewCommunity(){
        Community newcomm = new Community();
        commlist.add(newcomm);
        return newcomm;
    }
    
    public void deleteCommunity(Community comm){
        commlist.remove(comm);
    }
}
