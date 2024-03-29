package day15.tips.a01Abstract;

public abstract class Animal {
    private String name;
    private int age;

    //抽象方法
    public abstract void eat();

    public void run() {
        System.out.println("跑");
    }

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
