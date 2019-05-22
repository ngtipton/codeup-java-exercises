package shapes;

public class ShapeTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(0, 5);
        System.out.println("getArea = " + box1.getArea());
        System.out.println("getPerimeter = " + box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.println("getArea = " + box2.getArea());
        System.out.println("getPerimeter = " + box2.getPerimeter());

    }

}