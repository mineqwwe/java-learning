package day04;

import java.util.Scanner;

public class LoopsTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字1：");
        int number1 = sc.nextInt();
        System.out.println("输入数字2：");
        int number2 = sc.nextInt();
        int max = number1 > number2 ? number1 : number2;
        int min = number1 > number2 ? number2 : number1;
        int sum = 0;
        while (min <= max) {
            if (min % 3 == 0 && min % 5 == 0 && !(min == 0)) {
                sum++;
            }
            min++;
        }
        System.out.println("既能被3整除，又能被5整除数字有" + sum + "个");

    }

}