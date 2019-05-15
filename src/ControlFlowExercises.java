import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        // While Loop

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        // Do While Loop

//        int countbyTwo = 0;
//        do {
//            System.out.println(countbyTwo);
//            countbyTwo += 2;
//        } while (countbyTwo <= 100);

//        int backwardsByFive = 100;
//        do {
//            System.out.println(backwardsByFive);
//            backwardsByFive -= 5;
//        } while (backwardsByFive >= -10);

//        long numberSquared = 2;
//        do {
//            System.out.println(numberSquared);
//            numberSquared *= numberSquared;
//        } while (numberSquared < 1000000);

        // For Loop

//        for(int ii = 5; ii <= 15; ii++){
//            System.out.print(ii + " ");
//        }
//        System.out.format("%n");

//        for(int countbyTwoo = 0; countbyTwoo <= 100; countbyTwoo += 2){
//            System.out.println(countbyTwoo + " ");
//        }
//
//        for(int backwardsByFivee = 100; backwardsByFivee >= -10; backwardsByFivee -= 5){
//            System.out.println(backwardsByFivee);
//        }
//
//        for(long numberSquaredd = 2; numberSquaredd < 1000000; numberSquaredd *= numberSquaredd){
//            System.out.println(numberSquaredd);
//        }

//        for(int fizz = 1; fizz <= 100; fizz++){
//            if(fizz % 3 == 0 && fizz % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else if(fizz % 3 == 0){
//                System.out.println("Fizz");
//            }else if(fizz % 5 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(fizz);
//            }
//        }

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
//
//        String userConfirm;
//        do{
//            System.out.println("Enter an integer for a table with that will square and cube the integer.");
//            int intInput = scanner.nextInt();
//
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for(int sqCu = 1; sqCu <= intInput; sqCu++){
//                System.out.printf ("%-7d|%-9d|%-6d%n", sqCu, (sqCu * sqCu), (sqCu * sqCu * sqCu));
//            }
//
//            System.out.println("Do you want to continue the loop?");
//            userConfirm = scanner.next();
//
//        }while(userConfirm.equalsIgnoreCase("yes") || userConfirm.equalsIgnoreCase("y"));

        System.out.println("Enter a numerical grade from 0 to 100.");
        int numericGrade = scanner.nextInt();
        String letterGrade;
        if(numericGrade >= 88) {
            letterGrade = "A";
        } else if(numericGrade >= 80) {
            letterGrade = "B";
        } else if(numericGrade >= 67) {
            letterGrade = "C";
        } else if(numericGrade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        System.out.println("Grade is a " + letterGrade);

    }
}