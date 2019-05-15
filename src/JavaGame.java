import java.util.Scanner;

public class JavaGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        //  Starting the game

        System.out.println("What's your name?");
        String userName = scanner.next();
        System.out.println("Hello " + userName + "! Do you want to start the game?");
        String start = scanner.next();

        //  Variables

        int heroHealth = (int) Math.floor(Math.random() * 30) + 20;
        int heroAttack = (int) Math.floor(Math.random() * 10) + 5;
        int heroDefence = (int) Math.floor(Math.random() * 5) + 5;
        int heroPotion = (int) Math.floor(Math.random() * 3) + 2;

        int enemyHealth = (int) Math.floor(Math.random() * 30) + 20;
        int enemyAttack = (int) Math.floor(Math.random() * 15) + 5;
        int enemyDefence = (int) Math.floor(Math.random() * 5) + 5;
        int enemyPotion = (int) Math.floor(Math.random() * 3) + 2;

        int potion = (int) Math.floor(Math.random() * 8) + 10;

        // Game entering play and showing stats

        if(start.equalsIgnoreCase("yes") || start.equalsIgnoreCase("y")) {
            System.out.println("Let's do it!");

            System.out.printf("Hero Stats: %nHealth: %d %nAttack: %d %nDefence: %d %nPotion: %d %n================%n", heroHealth, heroAttack, heroDefence, heroPotion);
            System.out.printf("Enemy Stats: %nHealth: %d %nAttack: %d %nDefence: %d %nPotion: %d %n================%n", enemyHealth, enemyAttack, enemyDefence, enemyPotion);

            // Player actions

            do {
                System.out.printf("Hero abilities: Choose an action. %n=================================%n 1. Attack %n 2. Use Potion %n 3. Run Away %n");
                String heroAction = scanner.next();
                if (heroAction.equals("1")) {//Action 1
                    System.out.printf("You swing at enemy.%n");
                    boolean block = (Math.random() < 0.5);
                    if (block) {
                        System.out.printf("Your attack was blocked.%n%n");
                    } else {
                        enemyHealth -= heroAttack;
                        System.out.printf("You attack the enemy for %d %nThe enemy's health is now: %d%n%n", heroAttack, enemyHealth);
                    }
                    if (enemyHealth > 0 && enemyHealth < 15 && enemyPotion >=1){
                        enemyHealth += potion;
                        enemyPotion -= 1;
                        System.out.printf("Enemy used potion for %d and it's health is now: %d%n%n", potion, enemyHealth);
                    }else{
                        System.out.printf("Enemy attacks you.%n");
                        block = (Math.random() < 0.5);
                        if (block) {
                            System.out.printf("You block the enemy's attack.%n%n");
                        } else {
                            heroHealth -= enemyAttack;
                            System.out.printf("Enemy attacks you for %d %nYour health is now: %d%n%n", enemyAttack, heroHealth);
                        }
                    }
                } else if (heroAction.equals("2")) {//Action 2
                    if(heroPotion >= 1){
                        heroHealth += potion;
                        heroPotion -= 1;
                        System.out.printf("You used a potion and regain %d health. %nYour health is now: %d%n%n",potion, heroHealth);
                    }else{
                        System.out.println("You don't have any potion.");
                    }
                } else if (heroAction.equals("3")) {//Action 3
                    System.out.println("You can't run.");
                }

            }while(enemyHealth > 0 && heroHealth > 0);

            //  Ending game prompts

            if(enemyHealth <= 0) {
                System.out.println("Congratulations, the enemy is dead");
            }

            if(heroHealth <= 0) {
                System.out.println("You are dead.");
            }

            //  Completing the if else for whether you wanted to start the game or not

        } else {
            System.out.println("Fine, bye.");
        }

    }
}