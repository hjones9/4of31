/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4of31;

import java.util.Scanner;

/**
 *
 * @author HAILEY.JONES
 */
public class Four {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a whole number");
        int y= reader.nextInt();
        int t=1;
        
        while (t <= y) {
            System.out.println(t);
            t++;
        }
        
       
    }
    
}
