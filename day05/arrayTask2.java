package day05;

import java.util.Scanner;

public class arrayTask2 {
    public static void main(String[] args) {
        double[] arr = { 12.9, 53.54, 75.0, 99.1, 3.14 };
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = min > arr[i] ? arr[i] : min;
        }
        System.out.println(min);
    }

}