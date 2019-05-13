import java.util.Scanner;

public class JavaGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter Name

        System.out.println("Please enter your name.");
        String enterName = sc.nextLine();

        String yourName = enterName;

        System.out.println(yourName + ", type yes if you are ready to begin");
        String readyPlayer = sc.nextLine();

        if (readyPlayer.equalsIgnoreCase("yes")) {
            System.out.println("Let's get to it.");
        } else {
                System.out.println("Fine, fuck off.");
            }
        }


    }
