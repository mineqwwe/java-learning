package day14.a01Polymorphism;

public class Animal {
    private String color;
    private int age;

    public Animal() {
    }

    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say(){
        System.out.println("Animal-say()");
    }

    public void eat(){
        System.out.println("Animal-eat()");
    }
}
