/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex12;

import java.util.*;

/**
 *
 * @author INTEL
 */
public class arrayoperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //counting odd integers in the list
        Integer n[]={1,2,3,4,5};
        oddcount<Integer> obj=new oddcount<>(n);
        System.out.println("The Integer array is:");
        System.out.println(Arrays.toString(n));
        obj.count();
        
        //exchange positions in integer array
        Integer a[]={2,4,6,8,10};
        exchange_max<Integer> obj1=new exchange_max<>();
        System.out.println("The Integer array is:");
        System.out.println(Arrays.toString(a));
        obj1.swap(a,1,4); 
        System.out.println("After exchanging positions:");
        System.out.println(Arrays.toString(a));
        
        //exchange positions in character array
        Character c[]={'s','u','b','h','a'};
        exchange_max<Character> obj3=new exchange_max<>();
        System.out.println("The Character array is:");
        System.out.println(Arrays.toString(c));
        obj3.swap(c,0,2); 
        System.out.println("After exchanging positions:");
        System.out.println(Arrays.toString(c));
        
        //exchange positions in string array
        String s[]={"java","oops","python","cp"};
        exchange_max<String> obj5=new exchange_max<>();
        System.out.println("The String array is:");
        System.out.println(Arrays.toString(s));
        obj5.swap(s,1,3);
        System.out.println("After exchanging positions:");
        System.out.println(Arrays.toString(s));
        
        //finding maximalelement in integer array
        Scanner obj2=new Scanner(System.in);
        System.out.println("Enter the beginning value of the range:");
        int begin=obj2.nextInt();
        System.out.println("Enter the end value of the range:");
        int end=obj2.nextInt();
        System.out.println("The maximal element in the range["+begin+","+end+"] is :"+obj1.maximalelement(a,begin,end));
        
        //finding maximalelement in character array
        Scanner obj4=new Scanner(System.in);
        System.out.println("Enter the beginning value of the range:");
        begin=obj4.nextInt();
        System.out.println("Enter the end value of the range:");
        end=obj4.nextInt();
        System.out.println("The maximal element in the range["+begin+","+end+"] is :"+obj3.maximalelement(c,begin,end));
        
        //finding maximalelement in string array
        Scanner obj6=new Scanner(System.in);
        System.out.println("Enter the beginning value of the range:");
        begin=obj6.nextInt();
        System.out.println("Enter the end value of the range:");
        end=obj6.nextInt();
        System.out.println("The maximal element in the range["+begin+","+end+"] is :"+obj5.maximalelement(s,begin,end));
        
    }
    
}
class oddcount<V extends Number>
{
      int i;
      V[] value;
      int count=0;
      public oddcount(V[] value)
      {
          this.value=value;
      }
      public void count()
      {
         for(i=0;i<value.length;i++)
         {
            if((value[i].doubleValue())%2!=0)
            {
              count++;
            }
         }
         System.out.println("Number of odd integers in list:"+count);
      }

}
class exchange_max<T>
{
   
    public <T> void swap(T[] value,int begin,int end) //generic method to exchange positions
    {
        System.out.println("Exchanging positions of "+begin+" and "+end+" in array:");
        for(int i=0;i<value.length;i++)
        {
            for(int j=0;j<value.length;j++)
            {
               if((begin==i)&&(end==j))
               {
                   T t=value[i];
                   value[i]=value[j];
                   value[j]=t;
                   break;
               }
            }
        }
       
    }
    public static<T extends Comparable>T maximalelement(T[] value,int begin,int end)//generic method to find maximal element
    {
       
        T max=value[begin];
        int i;
    
        for(i=begin+1;i<end;i++)
        {
            if(value[i].compareTo(max)>0)
            {
               max=value[i]; 
            }
            
        }
 
        return max;
    }
    
}

    
