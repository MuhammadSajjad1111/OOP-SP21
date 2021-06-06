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
public class Person {
String name;
int id;

public Person(String name,int id){
this.name=name;
this.id=id;
}

    /**
     *
     * @return       
     */
    @Override
public String toString(){
 String s;
 s=" Name :: "+name+"\n id ::  "+id;
 return s;
}
}
