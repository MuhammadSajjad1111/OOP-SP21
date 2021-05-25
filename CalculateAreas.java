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
public class CalculateAreas {

  static double[] func(Shape[] shapes) {
        double[] ans = new double[shapes.length];
        for(int i=0;i<shapes.length;i++) {
            if(shapes[i]!=null)
                ans[i] = shapes[i].area();
        }
        return ans;
    }
 
     
    
    
    
    }

