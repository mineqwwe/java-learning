package day15.tips.a01Abstract;

public class Test {
    public static void main(String[] args) {
        // Animal animal = new Animal(); 'Animal' 为 abstract；无法实例化

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.run();
        cat.run();

        dog.eat();
        cat.eat();


    }
}
