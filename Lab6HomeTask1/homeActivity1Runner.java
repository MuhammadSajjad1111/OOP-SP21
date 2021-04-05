/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tahir
 */
public class homeActivity1Runner {
    public static void main(String[]arg){
        savingBalance saver1=new savingBalance(2000);
        savingBalance saver2=new savingBalance(3000);
        double saving1, saving2;
        saver1.calculateMonthlyInetrest();
        saver2.calculateMonthlyInetrest();
        saver1.calculateMonthlyInetrest();
        saver2.calculateMonthlyInetrest();
        saver1.calculateMonthlyInetrest();
        saver2.calculateMonthlyInetrest();
        System.out.println("saver1 :"+saver1.getSavingsBalance());
        System.out.println("saver2 :"+saver2.getSavingsBalance());
        
        savingBalance.anualInterestRate=0.015;
    }
}
