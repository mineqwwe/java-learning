package day11;

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {
        String[] str = { "aaa", "bbb", "aaa", "aaa", "ccc", "bbb" };
        ArrayList<String> container = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            container.add(str[i]);
        }
        System.out.println(container);

    }

}