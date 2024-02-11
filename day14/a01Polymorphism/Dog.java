package day14.a01Polymorphism;

public class Dog extends Animal {
    private  String dog;
    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat() {
        System.out.println("狗eat()");
    }

    public void lookHome() {
        System.out.println("狗lookHome()");
    }
}
