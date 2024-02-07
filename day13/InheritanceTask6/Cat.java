package day13.InheritanceTask6;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String color, int age) {
        super(color, age);
    }
    //eat(String something)方法,逮老鼠catchMouse方法(无参数)

    @Override
    public void eat(String something) {
        System.out.println("猫在吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}
