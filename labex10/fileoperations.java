/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex10;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author INTEL
 */
public class fileoperations {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException,IOException{
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the file name");
        String fname=obj.next();
        File f=new File(fname);
        
        System.out.println("The given file's name is"+fname.substring(0,fname.indexOf('.')));
        System.out.println("The given file's type is"+fname.substring(fname.indexOf('.')+1));
        
        if(f.exists())     //checking file exists or not
            System.out.println("The given file name "+fname+" exists");
        else
            System.out.println("The given file name "+fname+" does not exists!");
        
        if(f.canRead())    //checking file is readable or not
            System.out.println("The given file "+fname+" is readable");
        else
            System.out.println("The given file "+fname+" is not readable!");
        
        if(f.canWrite())   //checking file is writable or not
            System.out.println("The given file "+fname+" is writable");
        else
            System.out.println("The given file "+fname+" is not writable!");
        
        if(f.canExecute())  //checking file is executable or not
            System.out.println("The given file "+fname+" is executable");
        else
            System.out.println("The given file "+fname+"is not executable!");
        
        System.out.println("The given file's length is: "+(byte)f.length());  //finding length of the file
       
        
        
           
        
        
    }
    
}
