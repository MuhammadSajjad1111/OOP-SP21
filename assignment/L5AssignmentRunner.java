/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author tahir
 */
public class L5AssignmentRunner {
    public static void main(String[]arg){
        Fraction fraction1=new Fraction();
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter nominator.  ");
        int n1=scan.nextInt();
        System.out.print("Enter denominator.   ");
        int d1=scan.nextInt();
        
        fraction1.setNominator(n1);
        fraction1.setDenominator(d1);
        
        System.out.print("Enter nominator.  ");
        int n2=scan.nextInt();
        System.out.print("Enter denominator.   ");
        int d2=scan.nextInt();
        
        Fraction fraction2=new Fraction(n2, d2);
        
        if(fraction1.equals(fraction2)){
            System.out.println("both fractions are identical");
        }else{
            System.out.println("they are not identical");
        }
    }
}
