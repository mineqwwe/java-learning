package day11;

import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("赵老师", "javase");
        Teacher t2 = new Teacher("钱老师", "javaee");
        Teacher t3 = new Teacher("孙老师", "php");
        Teacher t4 = new Teacher("李老师", "python");
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);

        for (int i = 0; i < teachers.size(); i++) {
            Teacher t = teachers.get(i);
            System.out.println("name: " + t.getName() + ", Professio: " + t.getProfession());
            System.out.println(t.toString());
        }

    }

}