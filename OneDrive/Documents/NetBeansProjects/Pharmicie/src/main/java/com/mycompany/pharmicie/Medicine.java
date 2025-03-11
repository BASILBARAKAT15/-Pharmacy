/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmicie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eng-BASIL BARAKAT
 */
public class Medicine {
      public String    medicineName="";
    public String  geanricName="";
    public String dsage="";
    public String exirationDate="";
    public String drugCode="";
    
    public void Midicien(){
     String    medicineName="";
     String  geanricName="";
     String dsage="";
     String exirationDate="";
     String drugCode="";
    }

    @Override
    public String toString() {
        return 
       ( "Medicine Nema:"+medicineName+'\t'+"Midicen genric nema:"+geanricName+"\t"+"Desage:"+dsage+"\t"+"Exiration Date:"+exirationDate+"\t"+"Drug Code="+drugCode+"\n");
    }
    
    public ArrayList<Medicine> resdfile(File f){
       // Vector<Medicine> medicines = new Vector<>();
ArrayList <Medicine> ml=new ArrayList<Medicine>();
int count=0;

        try  {
                   Scanner s=new Scanner(f);

            
            while (s.hasNext()) {
                 
              
              
                Medicine medicine = new Medicine();
                  medicine.medicineName = s.next();
                medicine.geanricName= s.next();
                medicine.dsage=s.next();
                medicine.exirationDate=s.next();
                medicine.drugCode=s.next();
                s.nextLine();
               // System.out.print(s.nextLine());
              //  medicines.add(medicine);
              ml.add(count, medicine);
              count++;
            }s.close();
        } catch (FileNotFoundException e) {
            System.out.print("The file dosent exsit");
        }
return  ml;

    }
    
    
    
    
    
    
   public void writeFile(ArrayList<Medicine> ml){
        
    
        
          try  {
                   BufferedWriter writer=new BufferedWriter(new FileWriter("Output.txt")); 

            
             for(int i=0;i<ml.size();i++ ) {
               
                 
              
              
            
           writer.write(ml.get(i).medicineName+"\t"+ml.get(i).geanricName+"\t"+ml.get(i).dsage+"\t"+ml.get(i).exirationDate+"\t"+ml.get(i).drugCode+"\n");
           
            
             }writer.close();
        } 
          catch (IOException ex) {
        Logger.getLogger(PharmiacyForm.class.getName()).log(Level.SEVERE, null, ex);
    }
         
    }
    
   
   
   
   
   
   
     public  void copyFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Output.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Medicine.txt"))) {

            String line;
            // قراءة كل سطر من الملف المصدر وكتابته في الملف الوجهة
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // إضافة سطر جديد
            }
            System.out.println("تم نسخ البيانات بنجاح.");
        } catch (IOException e) {
            System.out.println("حدث خطأ: " + e.getMessage());
        }
    }

  

   
   
   
   
   
   
   
    
}
