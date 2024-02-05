package day04;

import java.util.Scanner;

public class SwitchTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数: ");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数: ");
        int b = sc.nextInt();
        System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): ");
        int c = sc.nextInt();
        int out = 0;
        String op = "";
        switch (c) {
            case 1 -> {
                out = a + b;
                op = "+";
            }
            case 2 -> {
                out = a - b;
                op = "-";
            }
            case 3 -> {
                out = a * b;
                op = "*";
            }
            case 4 -> {
                out = a / b;
                op = "/";
            }
            default -> {
                System.out.println("请输入正确的数字");
            }
        }
        if (!(op == "")) {
            System.out.println(a + op + b + "=" + out);
        }

    }

}