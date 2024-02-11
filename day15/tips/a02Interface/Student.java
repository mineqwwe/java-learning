package day15.tips.a02Interface;

public class Student extends Person implements SpeakEnglish{
    @Override
    public void eat() {
        System.out.println("Student中继承实现的eat()");
    }

    @Override
    public void sleep() {
        System.out.println("Student中继承实现的eat()");

    }

    @Override
    public void speakEnglish() {
        System.out.println("Student中从接口实现的speakEnglish()");

    }

    @Override
    public void learnEnglish() {
        System.out.println("Student中从接口实现的learnEnglish()");

    }
}
