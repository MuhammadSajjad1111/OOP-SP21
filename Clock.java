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
public class Clock {
int hour;
int minute;
int second;

public Clock(){
this.hour=1;
this.minute=1;
this.second=1;
}

public Clock(int h, int m, int s){
this.hour=h;
this.minute=m;
this.second=s;
}
public void Display(){
    System.out.println("Time in hr:min:sec is "+hour+":"+minute+":"+second);
}
    
}
