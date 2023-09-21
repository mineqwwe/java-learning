public class PhoneTest {

    public static void main(String[] args) {
        Phone p = new Phone();

        p.setBrand("小米");
        p.setColor("白色");
        p.setPrice(1999);

        p.call();

        Phone p2 = new Phone();
        p2.call();


        Phone p3 = new Phone();
    }

}