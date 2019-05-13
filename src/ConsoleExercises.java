import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.\n", pi);
//
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter your favorite number.");
//        String favNumber = sc.nextLine();
//
//        System.out.println("That number is: " + favNumber);

//        System.out.println("Please enter the first word.");
//        String firstWord = sc.nextLine();
//
//        System.out.println("Please enter the second word.");
//        String secondWord = sc.nextLine();
//
//        System.out.println("Please enter the third word.");
//        String thirdWord = sc.nextLine();
//
//        System.out.println("That string is: " + (firstWord + " " + secondWord + " " + thirdWord));

        System.out.println("Please enter the room width.");
        int roomWidth = sc.nextInt();

        System.out.println("Please enter the room width.");
        int roomHeight = sc.nextInt();

        float perimeter = roomHeight * 2 + roomWidth * 2;
        float area = roomHeight * roomWidth;

        System.out.printf("That perimeter is: %.2f\n", perimeter);
        System.out.printf("That area is: %.2f", area);
    }
}
