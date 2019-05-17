package util;

public class InputTest {

    public static void main(String[] args) {

        Input today = new Input();

        System.out.println(today.getString());

        System.out.println(" Your number is: " + today.getInt(5, 25));

        System.out.println(today.yesNo());

        System.out.println(today.getInt());

        System.out.println(today.getDouble(5.5, 25.5));

        System.out.println(today.getDouble());


    }

}