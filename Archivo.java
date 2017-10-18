/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ef5;

import java.io.*;

/**
 *
 * @author crist
 */
public class Archivo {
    private String url ="C:\\Users\\crist\\OneDrive\\Documentos\\NetBeansProjects\\EF5\\test\\Fibonacci.txt";
    private File archivo;
public String readFile(File archivo){
String texto="";
        FileReader fr=null;
        BufferedReader br;
        try {
            archivo = new File (url);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            
            String linea;
            while((linea=br.readLine())!=null)
               texto+=linea;
         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
        
        return texto;
    }    
}
