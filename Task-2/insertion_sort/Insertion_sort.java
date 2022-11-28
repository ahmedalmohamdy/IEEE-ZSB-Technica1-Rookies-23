/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.insertion_sort;

/**
 *
 * @author HP
 */
public class Insertion_sort {

   public static void main(String[] args) {
        
        int[] x = {1,5,7,9,3,4};
       for (int i = 1 ; i<x.length;i++){
           
    int k = x[i];
    int j = i-1 ;
    while(j>=0 && x[j]>k){
    x[j+1] = x[j]  ;
    j--;    }
    x[j+1] = k ;
    }
              for (int i = 0 ; i<x.length;i++){
        System.out.print(x[i]+"  ");
        
    }
}
    
}