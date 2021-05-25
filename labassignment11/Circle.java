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
public class Circle implements Shape {
    double radius;
    
    public Circle(double radius){
    this.radius=radius;
    }

    /**
     *
     * @return
     */
    @Override
     public double area(){
         return (Math.PI * radius * radius);
     }
     
     
}
