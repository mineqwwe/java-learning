package day14.Polymorphism;

//多态
public class Test {
    public static void main(String[] args) {
        //多态体现的格式：
        //父类类型 变量名 = new 子类/实现类构造器;
        //变量名.方法名();
        //多态的前提：有继承关系

        //调用成员变量时：只能调用父类的成员变量

        //调用成员方法时：如果方法被重写则调用子类，否则调用父类

        //多态的弊端:多态的写法就无法访问子类独有功能了

        Animal a = new Dog();

        //调用Animal中的say()
        a.say();

        //调用Dog中重写的eat()方法
        a.eat();

        //强转
        Dog b = (Dog) a;

        //调用Dog中的特有方法
        b.lookHome();

        //instanceof
        System.out.println( a instanceof Dog);//ture
        System.out.println( a instanceof Cat);//false

        //instanceof 返回 Dog dog2 = new Dog()
        if(a instanceof Dog dog2);

        //方法调用，传入子类
        Dog dog = new Dog();
        Cat cat = new Cat();
        register(dog);
        register(cat);

    }

    public static void register(Animal animal){
        System.out.println("register");
    }

}
