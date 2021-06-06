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
public class Student extends Person implements Association  {
   int registrationNo;
   String semester;
   public Student(String name,int id){
     super(name, id);
     
   }
   @Override
 public void associate(){
Scanner sc=new Scanner(System.in);
     System.out.println("Enter Students regestration number:");
 registrationNo=sc.nextInt(); 
     System.out.println("Enter the current semester:");
 semester=sc.next();
}
   @Override
 public String toString(){
     String s;
     s="Regestration number:: "+registrationNo+ " \n Semester:: "+semester;
 return super.toString()+"\n "+s;
 }


}
