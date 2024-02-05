package day07;

import java.util.Random;
import java.util.Scanner;

public class IntegrateTask8 {
    public static void main(String[] args) {
        int[] arr = { 2, 588, 888, 1000, 10000, 999 };//data can be 0
        //chouKa(arr);
    }
    //方法1
    // public static void chouKa(int[] arr) {
    //     Scanner sc = new Scanner(System.in);
    //     Random r = new Random();
    //     int times = 1;
    //     while (true) {
    //         System.out.println("按1继续，按0退出");
    //         int con = sc.nextInt();
    //         if (con == 1) {
    //             boolean news = true;
    //             while (news) {
    //                 int seed = r.nextInt(arr.length);
    //                 if (arr[seed] != -1) {
    //                     System.out.println(arr[seed] + "元的奖金被抽出");
    //                     arr[seed] = -1;
    //                     news = false;
    //                 }
    //             }
    //             times++;
    //             if (times > arr.length) {
    //                 System.out.println("奖金已被全部抽出");
    //                 break;
    //             }
    //         } else {
    //             break;
    //         }
    //     }
    // }

    //方法2 打乱数组  arr[i] = arr[randomIndex]
}