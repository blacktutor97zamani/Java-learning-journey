import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] arg){
        //Declare Variables
        //User Input
        //Dice Roll
        //ASCII representation of dice
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of Dice: ");
        int numberOfDice = scanner.nextInt();

        Random random = new Random();
        int roll = random.nextInt(1-7);



    }
}
