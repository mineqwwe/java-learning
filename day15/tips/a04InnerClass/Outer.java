package day15.tips.a04InnerClass;


// 成员内部类 inner
// 只给外部类 Outer 使用的类，单独存在没有意义
public class Outer {
    private String name;
    private int age;

    private class Inner {
        private String brand;

        public Inner(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

    }


    public void useInner() {
        Inner inner = new Inner("brand");
        System.out.println(inner);
    }

}
