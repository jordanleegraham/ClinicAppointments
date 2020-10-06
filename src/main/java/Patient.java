
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jordan Student No. x19103310
 * 
 */
public class Patient {//start class
    //patient variables
    private String firstname;
    private String surname;
    private String age;
    private String contactnumber;
    
    //appointment variables
    private String appointmenttype;
    private String symptoms;
    private String paymentmethod;
    
    private String searchedLetter;
    
    //constructor   
    public Patient(){
        
        firstname = new String();
        surname = new String();
        age = new String();
        contactnumber  = new String();
        
        appointmenttype = new String();
        symptoms = new String();
        paymentmethod = new String();
        
        searchedLetter = new String();
        
    }//end constructor
    
    //get/set methods
    public String getFirstname() {
        return firstname;
    }//end getter

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }//end setter

    public String getSurname() {
        return surname;
    }//end getter

    public void setSurname(String surname) {
        this.surname = surname;
    }//end setter

    public String getAge() {
        return age;
    }//end getter

    public void setAge(String age) {
        this.age = age;
    }//end setter

    public String getContactnumber() {
        return contactnumber;
    }//end getter

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }//end setter

    public String getAppointmenttype() {
        return appointmenttype;
    }//end getter

    public void setAppointmenttype(String appointmenttype) {
        this.appointmenttype = appointmenttype;
    }//end setter

    public String getSymptoms() {
        return symptoms;
    }//end getter

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }//end setter

    public String getPaymentmethod() {
        return paymentmethod;
    }//end getter

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }//end setter

    public String getSearchedLetter() {
        return searchedLetter;
    }//end getter

    public void setSearchedLetter(String searchedLetter) {
        this.searchedLetter = searchedLetter;
    }//end setter
    
}//end class
