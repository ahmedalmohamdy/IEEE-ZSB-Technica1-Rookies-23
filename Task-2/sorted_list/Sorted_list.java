/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sorted_list;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Sorted_list {

    public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0;//for next element  
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;  
    }  
       static Scanner input=new Scanner(System.in);
	static Scanner arraysize=new Scanner(System.in);
    public static void main (String[] args) { 
       int n;// Array size
        System.out.println(" how many numbers will you enter");
	  n=arraysize.nextInt();
	  int r=n;

  int f;
	  int[] arr=new int[r];

System.out.println("enter the numbers");
	  for(int i=0;i<arr.length;i++)
	  {
             
  f=input.nextInt();
	  arr[i]=f;

	  }
		
       
        
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  
