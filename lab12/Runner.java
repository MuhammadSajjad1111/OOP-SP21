/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author Jawad
 */
public class Runner{

    public static void main(String[] args) {
        
        HumanResource records = new HumanResource();
      
        
        Student S1=new Student("Muhammad",101);
        Student S2 = new Student("Asmad", 67);
        Teacher T1 = new Teacher("Bilal",111);
        Teacher T2 = new Teacher("Azfar",451);
        Student S3 = new Student("Amjad",654);
        
        
        records.add(S1);
        records.add(S2);
        records.add(T1);
        records.add(T2);
        records.add(S3);
        
        records.display();
        
        records.delete("Muhammad");
        records.delete("Amjad");
        
        System.out.println("-------!!!--------");
        
        records.display();
        
        
        
        
    }
    
    
}

        
        


