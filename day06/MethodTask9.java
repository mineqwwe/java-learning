import java.util.Scanner;

public class MethodTask9 {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 6, 1 };
        int newLength = 6;
        int[] newArr = copyOf(arr1, newLength);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);

        }

    }

    public static int[] copyOf(int[] arr, int newLength) {

        int[] newArr = new int[newLength];
        int minLength = arr.length < newLength ? arr.length : newLength;
        for (int i = 0; i < minLength; i++) {
            newArr[i] = arr[i];
        }
        return newArr;

    }

}