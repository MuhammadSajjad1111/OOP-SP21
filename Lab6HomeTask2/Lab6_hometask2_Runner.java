/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_hometask2_runner;

/**
 *
 * @author Jawad
 */
public class Lab6_hometask2_Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      ObjectCount obj_1=new ObjectCount();
       ObjectCount obj_2=new ObjectCount();
        ObjectCount obj_3=new ObjectCount();
        
        System.out.println(obj_1.countObjectCreated);
        obj_1=obj_1.destructor();
         obj_2=obj_2.destructor();
        System.out.println("Number of object destroyed "+ObjectCount.countObjectDestroyed);
        System.out.println(obj_2.data);
    }
    
}
