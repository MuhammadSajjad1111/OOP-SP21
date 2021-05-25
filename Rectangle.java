/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment11;

/**
 *
 * @author Jawad
 */
public class Rectangle  implements Shape  {
    double length;
    double width;
    
     public Rectangle(double length,double width){
         this.length=length;;
         this.width=width;
    }
    
    @Override
     public double area(){
     return (length * width);
     }
}
