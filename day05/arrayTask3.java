package day05;

import java.util.Random;
import java.util.Scanner;

public class arrayTask3{
    public static void main(String[] args){
       int[] arr = new int[6];
       Random r = new Random();
       for (int i = 0; i < arr.length; i++) {
        arr[i] = r.nextInt(100);
        System.out.println(arr[i]);
        
       }

       int sum = 0;
       for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
        
       }
       System.out.println("sum:" + sum);
    }

}