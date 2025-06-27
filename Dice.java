import java.util.Random;
public class Dice{
    public static void main(String[] args){
        int Dice1,Dice2,total;
        Dice1 = new Random().nextInt(6) + 1;
        Dice2 = new Random().nextInt(6) + 1;
        total = Dice1 + Dice2;
        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + Dice1);
        System.out.println("Die 2: " + Dice2);
        System.out.println("Total value: " + total);
    }
}