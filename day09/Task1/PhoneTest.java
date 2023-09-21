import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {

        // 动态创建 对象数组
        //int[] arr = new int[3]
        Phone[] arr = new Phone[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            Phone p = new Phone();
            System.out.println("输入手机品牌：");
            String brand = sc.next();
            System.out.println("输入手机价格：");
            int price = sc.nextInt();
            System.out.println("输入手机颜色：");
            String color = sc.next();
            p.setBrand(brand);
            p.setColor(color);
            p.setPrice(price);

            arr[i] = p;

        }

        int sumPrice = 0;

        for (int i = 0; i < arr.length; i++) {
            // Phone p2 = arr[i];
            // 调用对象方法 method();
            sumPrice = sumPrice + arr[i].getPrice();
        }

        int avgPrice = sumPrice / 3;
        System.out.println("avgPrice" + avgPrice);
    }
}