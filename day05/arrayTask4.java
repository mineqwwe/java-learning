package day05;

import java.util.Random;
import java.util.Scanner;

public class arrayTask4{
    public static void main(String[] args){
       int[] arr = new int[5];
       Random r = new Random();
       for (int i = 0; i < arr.length; i++) {
        arr[i] = r.nextInt(10);
        
       }
       int sum = 0;
       for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
        int ten =1;
        int index = i;
      
        while (arr.length- 1 - index > 0){
            ten  = ten *10;
            index++;
        }
        sum = sum + arr[i]*ten;
        
       }
       System.out.println("sum:"+sum);
    }

}