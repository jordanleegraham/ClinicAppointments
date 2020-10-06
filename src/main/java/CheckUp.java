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
public class CheckUp extends Patient{//start class
    //creating unique variables to the 'checkup' class
    private String prevCheckUpDate;
    private String priorInjuries;
    
    //instructor with inherited variables from superclass(Patient)
    public CheckUp(){
        //using super keyword to access variables from Patient class
        super.getFirstname();
        super.getSurname();
        super.getAge();
        //adding unique checkup variables to constructor
        prevCheckUpDate = new String();
        priorInjuries = new String();
        //retrieving more variables from parent(Patient) class
        super.getAppointmenttype();
        super.getPaymentmethod();
    }//end constructor
    
    //Get/Set Methods
    public String getPrevCheckUpDate() {
        return prevCheckUpDate;
    }//end getter

    public void setPrevCheckUpDate(String prevCheckUpDate) {
        this.prevCheckUpDate = prevCheckUpDate;
    }//end setter

    public String getPriorInjuries() {
        return priorInjuries;
    }//end getter

    public void setPriorInjuries(String priorInjuries) {
        this.priorInjuries = priorInjuries;
    }//end setter
       
}//end class
