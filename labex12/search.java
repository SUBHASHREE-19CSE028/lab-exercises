/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex12;

/**
 *
 * @author INTEL
 */
public class search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Integer aaray
        Integer n[]={1,3,5,7,9};
        searchelement<Integer,Integer> obj=new searchelement<>();
        obj.search(5, n);
        //Double array
        Double d[]={2.0,4.0,6.0,8.0,10.0};
        searchelement<Double,Double> obj1=new searchelement<>();
        obj1.search(3.0, d);
        //Floating point array
        Float f[]={2.5f,4.5f,6.7f,8.2f,10.5f};
        searchelement<Float,Float> obj2=new searchelement<>();
        obj2.search(6.7f, f);
        //String array       
        String s[]={"subha","ramya","ammu"};
        searchelement<String,String> obj3=new searchelement<>();
        obj3.search("harini", s);
        //Character array
        Character ch[]={'j','a','v','a'};
        searchelement<Character,Character> obj4=new searchelement<>();
        obj4.search('a', ch);
    }
    
}
class searchelement<T,V>
{
    boolean flag=false;
    public<T,V>void search(T s,V[] value)//generic method to search elements
    {
      int i;
      for(i=0;i<value.length;i++)
      {
          if(s.equals(value[i]))
          {
              flag=true;
              break;
          }
          else
              flag=false;
      }
      if(flag)
         System.out.println("Searched element "+s+" is found");
      else
         System.out.println("Searched element "+s+" is not found");
      
    }
}