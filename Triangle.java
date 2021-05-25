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
public class Triangle  implements Shape {
    double height;
    double base;
    
    public Triangle(double height,double base){
    this.base=base;
    this.height=height;
    }
    
    /**
     *
     * @return
     */
    @Override
     public double area(){
         return (0.5 * base * height);
     }
}
