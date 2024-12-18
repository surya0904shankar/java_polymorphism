package edu.spring_lessons.factory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;  
import java.util.Date; 

public class LogManager {
public static void logErrorMessageUsingFileOPStream(String message,String from) {
	//use file writer and write the message and from strings to CommonStrings.LOG_FILE
	FileOutputStream f = null;
	try {
		f = new FileOutputStream(CommonStrings.LOG_FILE);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	byte buf[] = message.getBytes();
	for (int i=0; i < buf.length; i ++) {
		try {
			f.write(buf[i]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		try {
			f.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	
}
public static void logErrorMessage(String message,String from,String messageType) {
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    Date date = new Date();  
	String data=formatter.format(date)+" "+messageType+" "+from+" : "+message+"\n";
	 FileWriter output =null;
	 try { 
          // Creates a FileWriter 
         
              output= new FileWriter(CommonStrings.LOG_FILE,true); 

          // Writes the string to the file 
          output.write(data); 

        
      } 

      catch (Exception e) { 
          e.getStackTrace(); 
      }
	  finally {
		  // Closes the writer 
          try {
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	  }
}

}

