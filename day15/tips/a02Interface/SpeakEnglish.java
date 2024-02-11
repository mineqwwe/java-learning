package day15.tips.a02Interface;


//接口只和方法相关， 与具体类归属无关
public interface SpeakEnglish {

    // 接口成员属性默认是 static 常量
    public final static double PI = 3.14;
    double G = 9.8;

    // 接口方法默认是 抽象方法
    // 没有构造方法
    public abstract void speakEnglish();

    void learnEnglish();

    //默认方法
    public default void writeEnglish() {
        see();
        System.out.println("写英语");
    }

    // 给default方法使用的私有方法
    private void see() {
        System.out.println("看英语");
    }
    //------------------------------------------

    //给内部static方法使用的方法
    private static void listenEnglish() {
        System.out.println("听英语");
    }

    public static void speakAgain() {
        listenEnglish();
        System.out.println("复读英语");
    }
}
