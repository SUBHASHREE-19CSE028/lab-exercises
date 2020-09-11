/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex8;
import java.util.*;
/**
 *
 * @author INTEL
 */
public class strequalparts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter a String:");
        String str=obj.next();
        int len=str.length(); 
        
        System.out.println("Enter the number of parts to divide the string:");
        int n=obj.nextInt();  //number of parts
        
        int temp=0,equalpart=len/n;  
        String equalStr[]=new String[n]; 
        
        if(len%n==0)
        {  
            for(int i=0;i<len;i=i+equalpart) 
            { 
                String part=str.substring(i,i+equalpart);  
                equalStr[temp]=part;  
                temp++;  
            }  
            System.out.println(n + " equal parts of given string are ");  
            for (String equalStr1:equalStr) 
            {
                System.out.println(equalStr1);
            }  
        }  
        else
            System.out.println("This string cannot be divided into "+ n +" equal parts.");   
        
    }
}
    
    

