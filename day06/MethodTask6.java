package day06;

import java.util.Scanner;

public class MethodTask6 {
    public static void main(String[] args) {
        int[] arr1 = { 0, 1, 2, 3 };
        int[] arr2 = { 0, 2, 2, 3 };
        boolean equals = equals(arr1, arr2);
        System.out.println(equals);

    }

    public static boolean equals(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) return false;

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }



}