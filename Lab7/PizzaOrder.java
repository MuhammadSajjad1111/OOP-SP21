/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author Jawad
 */
public class PizzaOrder {
    private Pizza PizzaOrder[]=new Pizza[3];
    private int a=0;
    
    PizzaOrder(Pizza abc){
        PizzaOrder[a]=abc;
        a++;
    }
    PizzaOrder(){
    }
    
    public double caltotal(){
        double sum=0;
        for(int i=0; i<a;++i){
        sum=sum+PizzaOrder[i].CalcCost();
                
    }
        return sum;
    }

    public void setPizzaOrder(Pizza xyz) {
        this.PizzaOrder[a] = xyz;
        a++;
    }
}
    
    

