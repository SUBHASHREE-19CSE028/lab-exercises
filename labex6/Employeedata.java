/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos2;
//can also do using read and display methods-----------------//
/**
 *
 * @author Subhashree
 */
public class homeworkprblm1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee e; //reference
        //dynamic method dispatch
        
        //Programmer subclass
        e=new Programmer("Ravi","IT701","TMS NAGAR,Tirupur","ravi01@gmail.com",7890867670L,2000);
        System.out.println(e);
        
        //Assisstant Profeesor subclass
        e=new AssisstantProfessor("Ram","IT702","SD Street,Madurai","ram54@gmail.com",6789034529L,5000);
        System.out.println(e);
        
        //Associate Professor subclass
        e=new AssociateProfessor("Rithu","IT850","ABC colony,Tanjore","rithubae@gmail.com",8097654888L,3500);
        System.out.println(e);
        
        //Professor subclass
        e=new Professor("Reema","IT550","Rajam Theatre,Tirunelveli","reematheclass@gmail.com",8067545443L,6000);
        System.out.println(e);
    }
    
}
class Employee
{
    String empname,empid,address,mailid;
    long mobno;
}
final class Programmer extends Employee
{
    double BP,DA,HRA,PF,fund,gross,net;
    Programmer(String en,String ei,String a,String mi,long mn,double b)
    {
        empname=en;
        empid=ei;
        address=a;
        mobno=mn;
        mailid=mi;
        BP=b;
        calc();
      
    }
    void calc()
    {
        DA=(97*BP)/100;
        HRA=(10*BP)/100;
        PF=(12*BP)/100;
        fund=(0.1*BP)/100;
        net=BP+DA+HRA+PF;
        gross=BP+DA+HRA-PF-fund;
    }
    @Override
    public String toString()
    {
        return ("\n=================\nPAY SLIP:\nPROGRAMMER:\nEmployee name:   "+empname+"\nEmployee id:   "+empid+"\nAddress:   "+address+"\nMobile no.   "+mobno+"\nMail id:   "+mailid+"\nBasic pay:   "+BP+"\nDirect allowance:   "+DA+"\nHRA:   "+HRA+"\nProvident fund:   "+PF+"\nStaff club fund:   "+fund+"\nGross salary:   "+gross+"\nNet salary:   "+net);
    }
}
final class AssisstantProfessor extends Employee
{
    double BP,DA,HRA,PF,fund,gross,net;
    AssisstantProfessor(String en,String ei,String a,String mi,long mn,double b)
    {
        empname=en;
        empid=ei;
        address=a;
        mobno=mn;
        mailid=mi;
        BP=b;
        calc();
    }
    void calc()
    {
        DA=(97*BP)/100;
        HRA=(10*BP)/100;
        PF=(12*BP)/100;
        fund=(0.1*BP)/100;
        gross=DA+HRA+PF;
        net=gross-(PF+fund);
    }
    @Override
    public String toString()
    {
        return ("\n=================\nPAY SLIP:\nASSISSTANT PROFESSOR:\nEmployee name:   "+empname+"\nEmployee id:   "+empid+"\nAddress:   "+address+"\nMobile no.   "+mobno+"\nMail id:   "+mailid+"\nBasic pay:   "+BP+"\nDirect allowance:   "+DA+"\nHRA:   "+HRA+"\nProvident fund:   "+PF+"\nStaff club fund:   "+fund+"\nGross salary:   "+gross+"\nNet salary:   "+net);
    }
}
final class AssociateProfessor extends Employee
{
    double BP,DA,HRA,PF,fund,gross,net;
    AssociateProfessor(String en,String ei,String a,String mi,long mn,double b)
    {
        empname=en;
        empid=ei;
        address=a;
        mobno=mn;
        mailid=mi;
        BP=b;
        calc();
    }
    void calc()
    {
        DA=(97*BP)/100;
        HRA=(10*BP)/100;
        PF=(12*BP)/100;
        fund=(0.1*BP)/100;
        gross=DA+HRA+PF;
        net=gross-(PF+fund);
    }
    @Override
    public String toString()
    {
        return ("\n=================\nPAY SLIP:\nASSOCIATE PROFESSOR:\nEmployee name:   "+empname+"\nEmployee id:"+empid+"\nAddress:"+address+"\nMobile no."+mobno+"\nMail id:"+mailid+"\nBasic pay:"+BP+"\nDirect allowance:"+DA+"\nHRA:"+HRA+"\nProvident fund:"+PF+"\nStaff club fund:"+fund+"\nGross salary:"+gross+"\nNet salary:"+net);
    }
}
final class Professor extends Employee
{
    double BP,DA,HRA,PF,fund,gross,net;
    Professor(String en,String ei,String a,String mi,long mn,double b)
    {
        empname=en;
        empid=ei;
        address=a;
        mobno=mn;
        mailid=mi;
        BP=b;
        calc();
    }
    void calc()
    {
        DA=(97*BP)/100;
        HRA=(10*BP)/100;
        PF=(12*BP)/100;
        fund=(0.1*BP)/100;
        gross=DA+HRA+PF;
        net=gross-(PF+fund);
    }
    @Override
    public String toString()
    {
        return ("\n=================\nPAY SLIP:\nPROFESSOR:\nEmployee name:   "+empname+"\nEmployee id:   "+empid+"\nAddress:   "+address+"\nMobile no.   "+mobno+"\nMail id:   "+mailid+"\nBasic pay:   "+BP+"\nDirect allowance:   "+DA+"\nHRA:   "+HRA+"\nProvident fund:   "+PF+"\nStaff club fund:   "+fund+"\nGross salary:   "+gross+"\nNet salary:   "+net);
    }
}
