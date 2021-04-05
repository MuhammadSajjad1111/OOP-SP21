/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_activity2;

/**
 *
 * @author Jawad
 */
public class NoOfObjects {
   private static int objs=0;
   private int a;
   
   public NoOfObjects(){

objs++;
}
   public NoOfObjects(int x){
    a=x;
objs++;
}
   public static int getObjs (){
return objs;
}
   
}
    
    

