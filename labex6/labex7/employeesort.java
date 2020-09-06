/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex7;
import java.util.*;
import java.util.ArrayList;   //importing ArrayList
import java.util.Comparator;  //importing Comparator
import java.util.Collections; //importing Collections
/**
 *
 * @author SUBHASHREE
 */
public class employeesort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <employee> list=new ArrayList<>();
        employee obj[];
        obj = new employee[2];
        for(int i=0;i<2;i++)
        {
            obj[i]=new employee(); 
        }
        for(int i=0;i<2;i++)
        {
            list.add(obj[i]);
        }
        
        Collections.sort(list,new sortbysalary());
        System.out.println("Sorted list by salary");
        System.out.println(list);     //sorted list
        
                
    }
    
}
class employee
{
    String name;
    double salary;
    employee()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name:");
        name=obj.next();
        System.out.println("Enter the salary:");
        salary=obj.nextDouble();
        
    }
    
    @Override
    public String toString()
    {
        return "\nName: "+name+"\tSalary: "+salary;
    }
}
class sortbysalary implements Comparator<employee>  
{
    @Override
    public int compare(employee e1,employee e2)
    {
        return (int)(e2.salary-e1.salary);
    }
}