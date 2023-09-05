import java.util.Scanner;

public class arrayTask1{
    public static void main(String[] args){
        String out = "";
        int[] arr ={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i] + " ");
            out = out + arr[i] + " ";            
        }
        System.out.println(out);
    }

}