import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        System.out.print(">");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        int dice1, dice2, total;
        dice1 = new Random().nextInt(6) + 1;
        dice2 = new Random().nextInt(6) + 1;
        total = dice1 + dice2;
        
        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + dice1);
        System.out.println("Die 2: " + dice2);
        System.out.println("Total value: " + total);
        if (total > 7) {
            System.out.println(name + " won!");
            } else {
                System.out.println(name + " lost!");
                }
        scanner.close();
    }
}
