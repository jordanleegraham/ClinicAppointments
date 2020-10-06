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
public class BloodTest extends Patient {//start class
    //creating unique variables to bloodtest class
    private String bloodtype;
    
    //instructor with inherited variables from superclass(Patient)
    public BloodTest(){
        //using super keyword to access variables from Patient class
        super.getFirstname();
        super.getSurname();
        super.getAge();
        //declaring regular variable to constructor
        bloodtype = new String();
        //using super keyword to access variables from Patient class
        super.getAppointmenttype();
        super.getPaymentmethod();
    }//end constructor
    
    //get/set methods
    public String getBloodtype() {
        return bloodtype;
    }//end getter

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }//end setter
    
}//end class
