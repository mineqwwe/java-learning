package day15.task.OOPTask1;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        System.out.println("圆的周长： "+circle.getCircumference());
        System.out.println("圆的面积： "+circle.getArea());

        Rectangle rectangle = new Rectangle(3.0,4.0);
        System.out.println("长方形的周长： "+rectangle.getCircumference());
        System.out.println("长方形的面积： "+rectangle.getArea());
    }
}
