/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.util.Scanner;

/**
 *
 * @author Jawad
 */
public class Teacher extends Person {
    String designation;
    String department;
    
    public Teacher(String name,int id){
    super(name, id);
    
    }
    public void associate(){
Scanner sc=new Scanner(System.in);
     System.out.println("Enter Designation:");
 designation=sc.next(); 
     System.out.println("Enter Department:");
department=sc.next();
}
       @Override
 public String toString(){
     String s;
     s="Designation :: "+designation+ "\n Department:: "+department;
 return super.toString()+"\n "+s;
 }

    
}
