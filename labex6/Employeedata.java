/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex6;
import java.util.*;
/**
 *
 * @author INTEL
 */
public class Employeedata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        employee s=new manager();
        System.out.println(s);
        
        employee s1=new manager();       
        System.out.println(s1);
 
        employee s2=new clerk();
        System.out.println(s2);
        
    }
    
}
abstract class employee
{
    String name;
    int age;
    public double hourrate,hours;
    abstract double calcsalary(double hours);
    @Override
    public String toString()
    {
        return "\nEmployee Details:"+"\n=================="+"\nName:"+name+"\nAge:"+age+"\nHourrate:"+hourrate+"\nSalary:"+calcsalary(hours);
    }

    
    
    
}
class manager extends employee
{
    manager()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("\nEnter the name:");
        name=obj.next();
        System.out.println("Enter the age:");
        age=obj.nextInt();
        hourrate=1000;
        System.out.println("Enter the time in hours:");
        hours=obj.nextDouble();
        
    }
  
   @Override
   double calcsalary(double hours)
   {
      double salary;
      salary=hours*hourrate;
      return salary;
      
   }
   
}
class clerk extends employee
{
    clerk()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("\nEnter the name:");
        name=obj.next();
        System.out.println("Enter the age:");
        age=obj.nextInt();
        hourrate=500;
        System.out.println("Enter the time in hours:");
        hours=obj.nextDouble();
    }
   @Override
   double calcsalary(double hours)
   {
      double salary;
      salary=hours*hourrate;
      return salary;
      
   }
    
    
}