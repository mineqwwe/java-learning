package day06;

import java.util.Scanner;

public class MethodTask1 {
    public static void main(String[] args) {
        double a = 4.6;
        double b = 1.2;
        double min = getMin(a, b);
        System.out.println(min);

    }

    public static double getMin(double num1, double num2) {
        double min = num1 < num2 ? num1 : num2;
        return min;
    }

}