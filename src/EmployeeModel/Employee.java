/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeModel;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author Akash
 */
public class Employee {
    String Name;
    String EmployeeID;
    String Age;
    String Gender;
    Date StartDate;
    String Level;
    String PhoneNumber;
    String EmailAddress;
    Image Photo;

    public String getName(String text) {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmployeeID(String text) {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getAge(String text) {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getGender(String text) {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Date getStartDate(Date date) {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public String getLevel(String text) {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getPhoneNumber(String text) {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmailAddress(String text) {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public Image getPhoto() {
        return Photo;
    }

    public void setPhoto(Image Photo) {
        this.Photo = Photo;
    }

    @Override
    public String toString() {
        return Name;
    }
           
    
    
    
}
