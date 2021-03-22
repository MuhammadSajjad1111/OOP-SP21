/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity1;

/**
 *
 * @author tahir
 */
public class Distance {
    public int feet;
    public int inches;
    public Distance(){
        feet=20;
        inches=30;
        
    }
    
    public Distance(int feet,int inch){
        this.feet=feet;
        this.inches=inch;
        
    }
    
    public int getFeet(){
        return feet;
    }
    
    public int getInches(){
        return inches;
    }
    
    public void setter(int feet,int inch){
        this.feet=feet;
        inches=inch;
    }
    
    public Distance add(Distance path1, Distance path2){
        Distance path=new Distance(feet+path1.feet+path2.feet , inches+path1.inches+path2.inches);
        return path;
    }
    
    public void display(){
        System.out.println("feet :"+feet);
        System.out.println("inches :"+inches);
    }
}
