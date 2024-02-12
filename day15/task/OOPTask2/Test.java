package day15.task.OOPTask2;

public class Test {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        usePhone(oldPhone);

        NewPhone newPhone = new NewPhone();
        usePhone(newPhone);

    }

    public static void usePhone(Phone p) {
        p.sendMessage();
        p.call();
        // 多态
        // 多态的弊端:多态的写法就无法访问子类独有功能了
        // 将Phone p强转为 NewPhone 来调用NewPhone里的特有方法
        if (p instanceof NewPhone newp) {
            newp.playGame();
        }
    }
}
