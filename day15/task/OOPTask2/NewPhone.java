package day15.task.OOPTask2;

public class NewPhone extends Phone implements PlayGame {
    @Override
    public void playGame() {
        System.out.println("新手机玩大型游戏");
    }
}
