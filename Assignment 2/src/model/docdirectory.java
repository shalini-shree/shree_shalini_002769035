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
public class docdirectory {
    
    ArrayList<doc> docList; 

    public docdirectory() {
        docList = new ArrayList<doc>();
    }
    
    
    public doc AddNewDoc(){
        doc newdoc = new doc();
        docList.add(newdoc);
        return newdoc;
    }

    public ArrayList<doc> getDocList() {
        return docList;
    }

    public void setDocList(ArrayList<doc> docList) {
        this.docList = docList;
    }
    
    public void deleteDoctor(doc d){
        docList.remove(d);
    }
}
