/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_Activity1;

/**
 *
 * @author Jawad
 */
public class Activity1_Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ABC ob1 = new ABC (); 
      ABC ob2 = new ABC (); 
      ob1.Var1=88;
      ob1.Var2="I'm Object1";
      ob2.Var2="I'm Object2";
      System.out.println("ob1 integer:"+ob1.Var1);
      System.out.println("ob1 String:"+ob1.Var2);
      System.out.println("ob2 integer:"+ob2.Var1); 
      System.out.println("ob2 STring:"+ob2.Var2);
    }
    
}
