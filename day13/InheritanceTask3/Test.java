package day13.InheritanceTask3;

public class Test {
    public static void main(String[] args) {
        System.out.println(Phone.size);

        Phone phone = new Phone();
        phone.call();
        phone.playGame();
        phone.sendMessage();

        phone.setBrand("apple");
        phone.setPrice(9999);

        System.out.println(phone.toString());
    }
}
