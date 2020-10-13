/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex11;

import java.util.Scanner;

/**
 *
 * @author INTEL
 */ 



class bankapp
{
    Scanner obj=new Scanner(System.in);
    //getting balance amount
    double balance=obj.nextDouble();
    
    synchronized void withdraw(double amount)
    { 
        if(this.balance < amount)
        {
             System.out.println("Balance amount in your account...Rs."+balance);
             System.out.println("Less balance amount,waiting to deposit.....");
        }
        try
        {
            wait(); 
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        this.balance-=amount;
        System.out.println("withdrawal amount.....Rs."+amount);
        notify();
        System.out.println("withdraw completed!!!");
        System.out.println("After the withdrawal,Balance amount in your account...Rs."+balance);
                
    }
    synchronized void deposit(double amount)
    {
        System.out.println("Going to deposit.......");
     
        if(amount<=40000 && amount>=100)
               this.balance+=amount;
        /*try
        {
            wait();
            
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }*/
     
        System.out.println("Deposited amount....Rs."+amount);
        
        notify();
        System.out.println("Deposited successfully!!");
        System.out.println("After deposited the amount,Balance in your account is..Rs."+balance);
                
    }
    
}
class credit implements Runnable
{
    bankapp p;
    credit(bankapp p)
    {
        this.p=p;
        new Thread(this,"deposit").start();
        try
        {
            Thread.sleep(6000);
            
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
                
    }
    @Override
    public void run()
    {
            double amount;
            System.out.println("Enter the amount to be credited:");
            Scanner obj=new Scanner(System.in);
            amount=obj.nextDouble();
            p.deposit(amount);
    }
    
}
class debit implements Runnable
{
    bankapp p;
    debit(bankapp p)
    {
        this.p=p;
        new Thread(this,"withdraw").start();
        try
        {
            Thread.sleep(5000);
            
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    @Override
    public void run()
    {
            double amount;
            System.out.println("Enter the amount to be debited:");
            Scanner obj=new Scanner(System.in);
            amount=obj.nextDouble();
            p.withdraw(amount);
       
    }
    
}

public class bankapplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to banking!!!");
        System.out.println("Enter the balance amount:");
        bankapp obj=new bankapp();
        debit d=new debit(obj);
        credit c = new credit(obj);
        
    }
    
}
