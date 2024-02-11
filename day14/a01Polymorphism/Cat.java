package day14.a01Polymorphism;

public class Cat extends Animal{
    private  String cat;
    public Cat() {
    }

    public Cat(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat() {
        System.out.println("猫eat()");
    }

    public void catchMouse(){
        System.out.println("catchMouse()");
    }

}
