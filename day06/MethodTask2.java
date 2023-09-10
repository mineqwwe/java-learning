import java.util.Scanner;

public class MethodTask2 {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 9;
        int n3 = 55;
        int Max = getMax(n1, n2, n3);
        System.out.println(Max);

    }

    public static int getMax(int a, int b, int c) {
        int Max = a > b ? a : b;
        Max = Max > c ? Max : c;
        return Max;
    }

}