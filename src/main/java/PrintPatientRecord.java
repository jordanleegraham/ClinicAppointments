
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jordan, Student No. x19103310
 */
public class PrintPatientRecord extends Patient {//start class
    //creating object of a file
    File file = new File("patientRecords.txt");
    PrintWriter pw;
    
    public void prnt(Patient patient) throws IOException{
        //error handling for when the file already exists
        if(file.exists()){
            pw = new PrintWriter(new BufferedWriter(new FileWriter("patientRecords.txt", true)));
        }//end if
        else{
            pw = new PrintWriter(file);
        }//end else
        
        pw.println(patient);
        pw.close();
    }//end method "prnt"
    
    public void move(){
        File dir = new File("Patient Records");
        
        if(!dir.exists()){
            dir.mkdir();
        }//end if
        
        InputStream inStream = null;
        OutputStream outStream = null;
        
        try{
            File copyfile = new File(dir + "\\RecordsCopy.txt");
            
            inStream = new FileInputStream(file);
            outStream = new FileOutputStream(copyfile);
            
            byte[] buffer = new byte[1024];
            int length;
            
            while((length = inStream.read(buffer)) > 0){
                outStream.write(buffer, 0, length);
            }//end while
            
          
            
            inStream.close();
            outStream.close();
            
            //delete the original file
            file.delete();                      
        
        }//end try
        catch(IOException e){
            e.printStackTrace();
        }//end catch
        
    }//end "move" method
}//end class
