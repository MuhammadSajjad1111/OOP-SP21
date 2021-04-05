/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_hometask2_runner;

public class ObjectCount {
  static int countObjectCreated;
  static int countObjectDestroyed;
  public int data;
 public ObjectCount(){
   countObjectCreated++;
  }  
 public static ObjectCount destructor(){
   countObjectDestroyed++;
   return null;
 }

}
