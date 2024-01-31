import java.util.Scanner;

public class IfTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 输入本金：");
        int base = sc.nextInt();
        System.out.println(" 输入年限：");
        int year = sc.nextInt();

        if (base >= 1000) {
            if (year == 1) {
                double all = base + base * 0.0225 * year;
                System.out.println(" 本息总额=" + all);

            } else if (year == 2) {
                double all = base + base * 0.0270 * year;
                System.out.println(" 本息总额=" + all);

            } else if (year == 3) {
                double all = base + base * 0.0325 * year;
                System.out.println(" 本息总额=" + all);

            } else if (year == 5) {
                double all = base + base * 0.0360 * year;
                System.out.println(" 本息总额=" + all);

            } else {
                System.out.println(" 不支持的年限");
            }

        } else {
            System.out.println(" 本金太少");
        }

    }
}