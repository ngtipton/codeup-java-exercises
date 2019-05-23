package shapes;

public class Square extends Quadrilateral {

    public Square (int length, int width){
        super(length, width);
    }

    public void setWidth(int width){
        this.length = width;
        this.width = width;
    }

    public void setLength(int length){
        this.length = length;
        this.width = length;
    }

    public double getPerimeter(){
        return this.length * 4;
    }

    public double getArea(){
        return this.length * this.length;
    }
}