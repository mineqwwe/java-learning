package day15.tips.a03DesignPattern;


// 接口里抽象方法很多，但只想用其中一个方法时，采用 适配器设计模式
public class InterImpl extends InterAdapter {
    @Override
    public void method5() {
        System.out.println("只要用的method5");
    }
}
