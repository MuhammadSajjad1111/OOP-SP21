/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author tahir
 */
public class Fraction {
    private int nominator;
    private int denominator;
    
    public Fraction(){
        
    }
    
    public Fraction(int n, int d){
        this.denominator=d;
        this.nominator=n;
    }
    
    public boolean equals(Fraction second){
        return(nominator==second.nominator && denominator==second.denominator);
    }
    
    public void setNominator(int n){
        this.nominator=n;
    }
    
    public int getNominator(){
        return nominator;
    }
    
    public void setDenominator(int d){
        this.denominator=d;
    }
    
    public int getdenominator(){
        return denominator;
    }
    
    public void Display(){
        System.out.println("Fraction is : "+nominator+"/"+denominator);
    }
}
