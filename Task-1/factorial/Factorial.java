/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factorial;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("enter the number :");
        int num = s.nextInt();
        int result = 1;
        for(int i = 1 ; i<=num; i++){
       result = result * i ; 
        }
        System.out.println("factorial of "+ num +" is :"+ result);    
            
    }
}
