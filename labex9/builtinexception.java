/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex9;

import java.util.*;

/**
 *
 * @author INTEL
 */
public class builtinexception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,k;
        int a[];       //declaring array
        a=new int[5];
        String s;      //declaring string
        Scanner obj=new Scanner(System.in);
        //for ArithmeticException
        try  //try block
        {
        System.out.println("Enter two integers:");
        i=obj.nextInt();
        j=obj.nextInt();
        k=i/j;
        System.out.println(k);       
        }
        catch(ArithmeticException e) //catch block  
        {
           System.out.println("Arithmetic Exception:"+e.getMessage()); 
        }
        //for ArrayIndexOutOfBoundsException
        try    //try block
        {
            System.out.println("Enter the index value and the corresponding element:");
            int index=obj.nextInt();
            int element=obj.nextInt();
            a[index]=element;
        }
        catch(ArrayIndexOutOfBoundsException e)  //catch block
        {
            System.out.println("ArrayIndexOutOfBoundsException:"+e.getMessage()); 
        }
        //for NumberFormatException
        try      //try block
        {
           
           k=Integer.parseInt(obj.next());
           System.out.println(k);  
        }
        catch(NumberFormatException e)   //catch block
        {
            System.out.println("NumberFormatException:"+e.getMessage());
        }
        //for StringIndexOutOfBoundsException
        try    //try block
        {
           System.out.println("Enter the string:");
           s=obj.next();
           String s1=s.substring(10);  //finding substring and storing it in new string
           System.out.println(s1);   //printing the substring of s
        } 
        catch(StringIndexOutOfBoundsException e) //catch block
        {
            System.out.println("Exception:"+e.getMessage());
        }
    }
    
}
