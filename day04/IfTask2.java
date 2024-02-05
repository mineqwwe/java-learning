package day04;

import java.util.Scanner;

public class IfTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("输入第三个数字：");
        int c = sc.nextInt();
        // if
        int max1;
        if (a > b) {
            max1 = a;
        } else {
            max1 = b;
        }
        if (max1 < c) {
            max1 = c;
        }
        System.out.println("1-最大值为：" + max1);
        // 三元
        int max2;
        max2 = a > b ? a : b;
        max2 = max2 > c ? max2 : c;
        System.out.println("2-最大值为：" + max2);

    }
}