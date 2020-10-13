/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex11;
import java.util.*;
/**
 *
 * @author INTEL
 */
public class threadprogram {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        thread1_Nvalues obj=new thread1_Nvalues();
        thread2_divisibleby5 obj1=new thread2_divisibleby5(obj);
        thread3_average obj2=new thread3_average(obj);
    }
}
class thread1_Nvalues implements Runnable   //thread1--->getting n values
{
    Scanner obj=new Scanner(System.in);
    
    int n;
    int value[];
    public thread1_Nvalues()
    {
       System.out.println("Enter the value of n:");
       n=obj.nextInt();
       value=new int[n];
       System.out.println(n+" values are:");
       for(int i=0;i<n;i++)
       {
            value[i]=obj.nextInt();
       }
        
    }
    @Override
    public void run()
    {
       this.n=n;
       new Thread(this).start();
    }
}
class thread2_divisibleby5 extends Thread  //thread2-->divisible by 5
{
    thread1_Nvalues n;
    thread1_Nvalues value[];
    public thread2_divisibleby5(thread1_Nvalues n)
    {
        this.n=n;
        new Thread(this).start();
    }
    @Override
    public void run()
    {
          try
          {
            Thread.sleep(6000);
          }
          catch(InterruptedException e)
          {
            System.out.println(e);
          }
          System.out.println("The numbers divisible by 5 are:");
          for(int i:n.value)
          {
             if(i%5==0)
                 System.out.println(i);
          
          }
    
    }
}
class thread3_average extends Thread   //thread3-->average
{
    thread1_Nvalues n; 
    thread1_Nvalues value[];
    public thread3_average(thread1_Nvalues n)
    {
        this.n=n;
        new Thread(this).start();
    }
    @Override
    public void run()
    {
      double sum=0;
      try
      {
         Thread.sleep(8000);
      }
      catch(InterruptedException e)
      {
         System.out.println(e);
      }
   
      for(int i:n.value)
      {
          sum=sum+i; 
      }
      double average;
      average = sum/n.value.length;  //finding average
      
      System.out.println("The average of "+n.value.length+" values: "+average);
    }
}
