import java.util.Random;
import java.util.Scanner;

public class arrayTask4S {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);

        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum = sum * 10 + arr[i]; // sum = sum*10

        }
        System.out.println("sum:" + sum);
    }

}