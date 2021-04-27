/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabAssignment_9;

/**
 *
 * @author Jawad
 */
public class ChildClock extends Clock {
    ChildClock(int a, int b, int c){
    super( a, b,  c);
    }
    public void Display(){
    super.Display();
    if(hour>=1 && hour<=12){
        hour=hour%12;
        System.out.println("The current time is " +hour+" hours AM");
    }
    else if(hour>=12 && hour<=24){
        hour=hour%12;
        System.out.println("The current time is " + hour+" PM");
    }
    
    
    }
}
