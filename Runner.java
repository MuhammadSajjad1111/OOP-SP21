/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;


public class Runner {
    public static void main(String[] args) {
        GradStudent std=new GradStudent();
        std.takeExam();
        PhdStudent pstd=new PhdStudent();
        pstd.takeExam();
    }
  
}