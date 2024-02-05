package day05;

import java.util.Random;
import java.util.Scanner;

public class arrayTask7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;// 1 ~ 100
        }
        int temp = arr[0];
        int ji = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                temp = arr[i];
                arr[i] = arr[ji + 1];
                arr[ji + 1] = temp;
                ji++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);//println
            System.out.print(arr[i]+" "); //print

        }

    }

}