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
public class Runner {
       public static void main(String[] args) {
            Shape[] shapes = new Shape[5];
            shapes[0] = new Rectangle(1.2, 3.4);
            shapes[1] = new Triangle(1.2, 1.4);
            shapes[2] = new Circle(4.2);
            shapes[3] = new Triangle(4,5);
            shapes[4] = new Circle(5);
            
            double areas[] = CalculateAreas.func(shapes);
            for(double a: areas) {  
                System.out.println(a);
            }
        }
}
