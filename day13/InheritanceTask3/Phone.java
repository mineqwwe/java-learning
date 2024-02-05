package day13.InheritanceTask3;

public class Phone {
    private String brand;
    private int price;

    public static int size = 6;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone->" +
                "brand='" + brand + '\'' +
                ", price=" + price
                ;
    }

    //行为:打电话call,发短信sendMessage,玩游戏playGame
    public void call() {
        System.out.println("打电话call");
    }

    public void sendMessage() {
        System.out.println("发短信sendMessage");
    }

    public void playGame() {
        System.out.println("玩游戏playGame");
    }
}
