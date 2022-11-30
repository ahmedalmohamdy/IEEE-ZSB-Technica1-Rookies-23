/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.book;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Book {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter number of pages");
        int total = x.nextInt();
        System.out.println("enter the page to turn to ");
        int page = x.nextInt();
       
        if(page%2==0 && page<=total/2){
        System.out.println(page/2);
        }
        else if(page%2==0 && page>total/2){
        System.out.println((total/2)- page/2);
        }
        else if(page%2!=0 && page<=total/2){
        System.out.println((page-1)/2);
        }
         else if(page%2!=0 && page>total/2){
        System.out.println((total/2)-(page-1)/2);
        }
         else {
         System.out.println("not found");
        
        }
       
    }
}
