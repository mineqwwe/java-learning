package day13.InheritanceTask6;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }
    //​ 行为: eat(String something)方法,看家lookHome方法(无参数)

    @Override
    public void eat(String something) {
        System.out.println("狗在吃" + something);
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }

}
