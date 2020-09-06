/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex5;

import java.util.Scanner;

/**
 *
 * @author INTEL
 */
public class student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        students obj[];
        obj = new students[100];
        for(int i=0;i<5;i++)
        {
            obj[i]=new students();
            obj[i].read();
            obj[i].display();
            
        }
        
    }
    
}
class college
{
    String clgname;
    int clgcode;
    Scanner obj=new Scanner(System.in);
    public void read()
    {
        System.out.println("ENTER THE STUDENT DETAILS:");
        System.out.println("****************");
        System.out.println("Enter the college name:");
        clgname=obj.next();
        System.out.println("Enter the college code:");
        clgcode=obj.nextInt();
        
    }
    public void display()
    {
        System.out.println("STUDENT DETAILS:");
        System.out.println("****************");
        System.out.println("College name:"+clgname);
        System.out.println("College code:"+clgcode);
    }
}
class department extends college
{
    String dept;
    @Override
    public void read()
    {
        super.read();
        System.out.println("Enter the name of the department:");
        dept=obj.next();
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Department:"+dept);
    }
}
class students extends department
{
    String stuname;
    String rollno;
    @Override
    public void read()
    {
        super.read();
        System.out.println("Enter the Student name:");
        stuname=obj.next();
        System.out.println("Enter the Rollno:");
        rollno=obj.next();
        System.out.println("****************");
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Student name:"+stuname);
        System.out.println("Roll no:"+rollno);
        System.out.println("****************");
    }
}