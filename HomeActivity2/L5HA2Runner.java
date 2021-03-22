/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity2;

/**
 *
 * @author tahir
 */
import java.util.Scanner;
public class L5HA2Runner {
    public static void main(String[]arg){
        
        String[] chapName=new String[100];
        
        int i=0;
        
        String cheack="a";
        
        Book b1=new Book();
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter Author Name of book 1:");
        String author1=scan.next();
        
        System.out.println("enter chapters of book 1 and Enter 0 for end:");
        while(!"0".equals(cheack)){
            cheack=scan.next();
            chapName[i]=cheack;
            i++;
        }
        
        b1.setAuthorName(author1);
        b1.setChapterNames(chapName);
        
        System.out.println("Enter Author Name of book 2:");
        String author2=scan.next();
        
        System.out.println("enter chapters of book 2 and Enter 0 to end:");
        cheack="a";
        while(!"0".equals(cheack)){
            cheack=scan.next();
            chapName[i]=cheack;
            i++;
        }
        Book b2=new Book(author2, chapName);
        
        if(b1.compareBooks(b2)){
            System.out.println("Author of Both Books is Same:");
        }else{
            System.out.println("Diffrent authors");
        }
        
        String greaterChap=b1.compareChapterNames(b2);
        System.out.println(greaterChap+"'s Book have greater Chapters.");
    }
}
