import java.util.Scanner;

public class LoopsTask1 {
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
            sum = sum + min;
            min++;
        }
        System.out.println("范围之内的数字和：" + sum);
        System.out.println("min：" + min);

    }

}