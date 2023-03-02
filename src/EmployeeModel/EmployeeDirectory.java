/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeModel;

import java.util.ArrayList;

/**
 *
 * @author Akash
 */
public class EmployeeDirectory {
    ArrayList<Employee> allEmployees;

    public EmployeeDirectory() {
        this.allEmployees = new ArrayList<>();
     
    }
    
    public ArrayList<Employee> getAllEmployees() {
        return allEmployees;
    }

    public void setAllEmployees(ArrayList<Employee> allEmployees) {
        this.allEmployees = allEmployees;
    }
    
    public void addEmployee(Employee newEmployee){
        this.allEmployees.add(newEmployee);
        
    }
    
    public void removeEmployee(Employee Employee){
        this.allEmployees.remove(Employee);
        
        
    }

    @Override
    public String toString() {
        return "EmployeeDirectory{" + "allEmployees=" + allEmployees + '}';
    }
    
    
    

            
            
            
    
}
