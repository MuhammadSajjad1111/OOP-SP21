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
public class L5HA1Runner {
    public static void main(String[]arg){
        Distance path1=new Distance();
        Distance path2=new Distance(50,55);
        Distance path3=new Distance(70,60);
        Distance path4=path1.add(path2, path3);
        path4.display();
        
    }
}
