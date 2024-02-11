package day15.tips.a02Interface;

public class Test {
    public static void main(String[] args) {
        Student student =new Student();
        //继承实现
        student.eat();
        student.sleep();

        //接口实现
        student.learnEnglish();
        student.speakEnglish();
        //接口的default方法
        student.writeEnglish();

        //接口的常量
        System.out.println(SpeakEnglish.PI);
        System.out.println(SpeakEnglish.G);

        //接口的静态方法
        SpeakEnglish.speakAgain();
    }
}
