/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author mburren
 */
import java.util.Scanner;
public class MyWeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kg = 0;
        double pounds = 0;
        Scanner in = new Scanner(System.in);
        
        kg = in.nextInt();
        pounds = kg*2.2;
        
        System.out.println(pounds);
    }
    
}
