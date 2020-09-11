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
public class palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=obj.next();
        String s1=s.toLowerCase().trim();
        char c[]=s1.toCharArray();
        boolean flag=true;
        for(int i=0;i<c.length/2;i++)
        {
            if(c[i]!=c[c.length-1-i])
            {
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println(s+" is Palindrome");
        else
            System.out.println(s+" is Not a palindrome");
    }
    
}
