package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea(){
        return Math.pow(super.length, 2);
    }

    @Override
    public double getPerimeter(){
        return 4 * super.width;
    }
}