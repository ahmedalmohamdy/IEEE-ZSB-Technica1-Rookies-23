/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rectangle;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Rectangle {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("enter the legth :");
        float len = s.nextFloat();
        System.out.println("enter the width");
        float wid = s.nextFloat();
        System.out.println("area is  " +(wid*len) );
        System.out.println("perimeter is  " + 2*(len +wid ));
    }
}
