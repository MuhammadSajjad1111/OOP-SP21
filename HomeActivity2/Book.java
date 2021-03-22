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
public class Book {
    private String author;
    private String[] chapterNames=new String[100];
    
    public Book(){
        
    }
    
    public Book(String author, String[] chapterNames){
        this.author=author;
        for(int i=0;i<100;i++){
            this.chapterNames[i]=chapterNames[i];
        } 
    }
    
    public void setAuthorName(String author){
        this.author=author;
    }
    
    public void setChapterNames(String[] chapterNames){
        for(int i=0;i<100;i++){
            this.chapterNames[i]=chapterNames[i];
        }
    }
    
    public boolean compareBooks(Book b){
        return author.equals(b.author);
    }
    
    public String compareChapterNames(Book b){
        
        for(int i=0;i<100;i++){
            if(chapterNames[i]!=null && b.chapterNames[i]!=null){
             
            }else if(chapterNames[i]!=null){
                return author;
            }else if(b.chapterNames[i]!=null){
                return b.author;
            }
        
        }
        return "both are equal";
    }
}
