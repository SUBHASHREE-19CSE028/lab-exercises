/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author INTEL
 */
public class copyfile {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
            FileInputStream fis = new FileInputStream("C:\\Users\\INTEL\\Documents\\NetBeansProjects\\JavaApplication2\\src\\excephand\\subha.txt"); 
            FileOutputStream fos = new FileOutputStream("C:\\Users\\INTEL\\Documents\\NetBeansProjects\\JavaApplication2\\src\\excephand\\hari.txt");
            int read;
            while((read=fis.read())!=-1)
            {
                if((char)read!=' ')
                {
                    fos.write(read);
                }
            }
            fis.close();
            fos.close();
        
    
    
    }
}
