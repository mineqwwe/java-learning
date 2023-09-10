import java.util.Scanner;

public class MethodTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int n1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int n2 = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int n3 = sc.nextInt();
        printOrder(n1, n2, n3);

    }

    public static void printOrder(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        int min = a < b ? a : b;
        min = min < c ? min : c;
        int middle =a;
        if (min < a && a < max)middle = a;
        if (min < b && b < max)middle = b;
        if (min < c && c < max)middle = c;
        System.out.println(min+" "+middle+" "+max);    
    }

}