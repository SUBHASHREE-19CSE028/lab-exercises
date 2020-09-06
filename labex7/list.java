/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex7;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author INTEL
 */
public class list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list=new ArrayList<>();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=obj.nextInt();
        System.out.println("Enter the elements:");
        for(int i=1;i<=n;i++)
        {
           int element=obj.nextInt();  
           list.add(element);
        }
        System.out.println("The elements in the list are:");
        System.out.println(list);
        
        //Finding average of numbers in the list
        int total=0;
        double avg=0;
        for(int i=0;i<list.size();i++)
        {
            total+=list.get(i);
            avg=total/list.size();
        }
        System.out.println("The Average of numbers in the list:"+avg);
        
        //Finding lowest and highest number in the list
        System.out.println("The lowest value in the list:"+Collections.min(list));
        System.out.println("The highest value in the list:"+Collections.max(list));
        
        //Finding even numbers in the list
        System.out.println("The Even numbers in the list are:");
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)%2==0)
            {
                System.out.println(list.get(i));
                list.remove(i);
            } 
        }
    }
    
}