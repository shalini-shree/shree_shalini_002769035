/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeData;
import java.util.ArrayList;
/**
 *
 * @author shalinishree
 */
public class employeeDirectory {
    private ArrayList<EmployeeData> directory;
    
    public employeeDirectory(){
        this.directory = new ArrayList<EmployeeData>();
        
    }

    public ArrayList<EmployeeData> getdirectory() {
        return directory;
    }

    public void setdirectory(ArrayList<EmployeeData> directory) {
        this.directory = directory;
    }
    
    public EmployeeData addNewDetails(){
        EmployeeData newDetails = new EmployeeData();
        directory.add(newDetails);
        return newDetails;
        
    }

    public void deleteEmployeeDetails(EmployeeData ed) {
        directory.remove(ed);
        
    }
}