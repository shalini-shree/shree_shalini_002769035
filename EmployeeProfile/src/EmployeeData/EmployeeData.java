/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeData;

import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Shalini Shree
 */
public class EmployeeData {
    private String employeefname;
    private String employeelname;
    private String employeeID;
    private String employeeAge;
    private String gender;
    private Date startdate;
    private String employeelevel;
    private String teaminfo;
    private String telephone;
    private String Email;
    private String Position;
    private ImageIcon ProfilePhoto;


    public String getemployeeFname() {
        return employeefname;
    }

    public void setemployeeFname(String employeefname) {
        this.employeefname = employeefname;
    }

    public String getemployeeLname() {
        return employeelname;
    }

    public void setemployeeLname(String employeelname) {
        this.employeelname = employeelname;
    }


    public String getemployeeID() {
        return employeeID;
    }

    public void setemployeeID(String employeeID){
        this.employeeID = employeeID;
    }
    
    public String getemployeeAge(){
        return employeeAge;
    }
    
    public void setemployeeAge(String employeeAge){
        this.employeeAge = employeeAge;
    }
    
    public String getgender(){
        return gender;
    }
    
    public void setgender(String gender){
        this.gender = gender;
    }
    
    public Date getstartdate() {
        return startdate;
    }

    public void setstartdate(Date startdate) {
        this.startdate = startdate;
    }
    
    public String getemployeelevel(){
        return employeelevel;
    }
    
    public void setemployeelevel(String employeelevel){
        this.employeelevel = employeelevel;
    }
    
    public String getteaminfo(){
        return teaminfo;
    }
    
    public void setteaminfo(String teaminfo){
        this.teaminfo = teaminfo;
    }
    
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public ImageIcon getPhotoID() {
        return ProfilePhoto;
    }

    public void setPhotoID(ImageIcon PhotoID) {
        this.ProfilePhoto = PhotoID;
    }  

    public void setIcon(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getposition() {
        return Position;
    }
    
    public void setposition(String Position){
        this.Position = Position;
    }

    public ImageIcon getProfilePhoto() {
        return ProfilePhoto;
    }

    public void setProfilePhoto(ImageIcon ProfilePhoto) {
        this.ProfilePhoto = ProfilePhoto;
    }
    
    @Override
    public String toString(){
        return employeeID;
    }
}
