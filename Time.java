/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3assignment2runner;

/**
 *
 * @author Jawad
 */
public class Time {
    int hour;
    int minutes;
    int second;
    
Time(){
}

Time(int hr,int min,int sec){
    hour=hr;
    minutes=min;
    second=sec;
}

public void Display(){
  if(hour>24 || minutes>60 || second>60){
      System.out.println("Invalid time"); 
  }
  else{
      System.out.println("Valid time "+hour+" : "+minutes+" : "+second);
  }
}
}

