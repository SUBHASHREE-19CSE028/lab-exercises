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
public class bankcredit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bankcredit obj=new bankcredit();
        try   //try block
        {
            obj.checkcredit(); //Calling of method checkcredit()
       
        }
        catch(CreditException e)  //catch block
        { 
            System.out.println("Exception:"+e);  
        }
        
    }
    void checkcredit() throws CreditException  
    {
        double amount;
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Daily limit to credit is minimum Rs.100 and maximum Rs.50000 in account");
        System.out.println("Enter the amount to be credited in the account:");
        amount=obj.nextDouble(); //getting amount from user
        
        if(amount < 100 || amount > 50000)
            throw new CreditException("Amount is out of limit to credit in account!!"); //throwing exception
        
        System.out.println("Credited Amount:"+amount);
    }
}
class CreditException extends Exception
{
    String message;
    CreditException(String m)
    {
        message=m;
    }
    @Override
    public String toString()
    {
        return message;
    }
} 
    
    
