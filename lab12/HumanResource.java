/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author Jawad
 */

import java.util.ArrayList;

public class HumanResource {
    
      private ArrayList<Person> array = new ArrayList();
    /*
    private Person[] array = new Person[1];
    private static int counter;
    
    
    public void add(Person p){
        
        
        array[counter] = p;
        if(array[counter] instanceof Teacher){
        
            ((Teacher)array[counter]).associate();
        }
        else if(array[counter] instanceof Student){
            
            ((Student)array[counter]).associate();
        }
        
        counter++;
        extend();
    }
    
    public void extend(){
        
        Person[] arr = new Person[counter + 1];
        int i = 0;
        
        for(Person x: array){
            
            arr[i] = x;
            i++;
                    
        }
        array = arr; 
        
    }
    
    public void delete(String s){
        
        
        Person[] arr = new Person[counter];
        int counter_arr = -1;
        int c = counter-1;
        
        for (int i = 0; i <= c; i++){
            
            counter_arr++;
            if(s.equals(array[i].name)){
                
                counter_arr--;
                counter-=1;
            }
            else{
                
                arr[counter_arr] = array[i];
            }
            
        }
        array = arr;
        
        
    }
    
    
    public void display(){
        
        for(int i = 0; i < counter; i++){
        System.out.println(array[i].toString());
        }
    }
    
    */
   
      public void add(Person s){
          
          if(s instanceof Teacher){
              
              ((Teacher)s).associate();
          }
          else if(s instanceof Student){
              
              ((Student)s).associate();
          }
          array.add(s);
      }
      
      public void delete (String s){
         
          int r;
          
          for(Person x: array){
              
              if(x.name.equals(s)){
                  
                  r = array.indexOf(x);
                  array.remove(r);
                  break;
              }
          }
           
      }
      
      
      public void display(){
       
          for(Person x: array){
              
              System.out.println(x);
          }
      }
    
    
}