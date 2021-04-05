/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tahir
 */
public class savingBalance {
    public static double anualInterestRate=0.01;
    private double savingsBalance;
    
    public savingBalance(){  
    }
    public savingBalance(double balance){
        this.savingsBalance=balance;
    }
    public static void setAnualInterestRate(double set){
        anualInterestRate=set;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public void calculateMonthlyInetrest(){
        double m=this.savingsBalance*anualInterestRate/12;
        this.savingsBalance=this.savingsBalance+m;
    }
}
