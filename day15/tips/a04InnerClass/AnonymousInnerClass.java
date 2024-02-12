package day15.tips.a04InnerClass;


// 匿名内部类
// 将继承或实现的类或接口 以参数的形式传入函数
public class AnonymousInnerClass {
    public static void main(String[] args) {
        System.out.println(
                new Swim() {
                    @Override
                    public int swim() {
                        return 9;
                    }

                    @Override
                    public int dry() {
                        return 6;
                    }
                }.swim()
        );
    }

}
