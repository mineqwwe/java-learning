package day13.InheritanceTask4;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("白色", 2);
        Dog dog = new Dog("黑色", 2);
        Person person = new Person("张三",23);

        person.keepPet(cat,"小鱼干");
        person.keepPet(dog,"骨头");

        Animal animal  = new Animal("白色",3);
        animal.eat("饭");

    }
}