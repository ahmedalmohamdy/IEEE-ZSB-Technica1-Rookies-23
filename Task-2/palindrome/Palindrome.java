/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.palindrome;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Palindrome {

    public static void main(String args[]) {
        System.out.println("enter the string");
      String myString = new Scanner(System.in).nextLine();
      StringBuffer buffer = new StringBuffer(myString);
      buffer.reverse();
      String data = buffer.toString();
      if(myString.equals(data)){
         System.out.println("yes");
      } else {
         System.out.println("no");
      }
   }
}
