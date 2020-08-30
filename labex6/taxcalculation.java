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
public class taxcalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        employee1 obj[];
        obj=new employee1[3];
        for(int i=0;i<3;i++)
        {
           obj[i]=new employee1();
           obj[i].information();
           obj[i].show();
        }
    }
    
}
interface customer
{
    public void information();
    public void show();
 
}

class employee1 implements customer
{
    String gender,male,female,empname,empid;
    double salary;
    @Override
    public void information()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Gender(male or female):");
        gender=obj.next();
        System.out.println("Enter the Employee Name:");
        empname=obj.next();
        System.out.println("Enter the Employee ID:");
        empid=obj.next();
        System.out.println("Enter the Salary amount:");
        salary=obj.nextDouble();
      
    }

    @Override
    public void show()
    {
        
        System.out.println("Employee is: "+gender);
        System.out.println("Employee Name: "+empname);
        System.out.println("Employee ID :"+empid);
        System.out.println("Salary: "+salary);
        if(salary<=190000)
        {
            if("male".equals(gender)&&"female".equals(gender))
                 System.out.println("Tax: "+0+"%");
        }
        else if(salary>190000 && salary<200000)
        {
            if("male".equals(gender))
                 System.out.println("Tax: "+10+"%");
            else if("female".equals(gender))
                 System.out.println("Tax: "+0+"%"); 
        }
        else if(salary>=200000 && salary<500000)
        {
            if("male".equals(gender))
                 System.out.println("Tax: "+20+"%");
            else if("female".equals(gender))
                 System.out.println("Tax: "+10+"%");
        }
        else if(salary>=500000)
        {
            if("male".equals(gender))
                 System.out.println("Tax: "+25+"%");
            else if("female".equals(gender))
                 System.out.println("Tax: "+20+"%");
        }    
    }
    
}