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


        for(int i = 1; i <= numberOfDice; i++ ){
            int roll = random.nextInt(1,7);
            System.out.print("Dice"+ i + " = " + roll + "\n");

        }

    }

    public static void AsciiRep(int roll){
            String dice1 = """
                     -------
                    |       |
                    |       |
                    |       |
                     -------
                    
                    """;

        String dice2 = """
                     -------
                    |       |
                    |       |
                    |       |
                     -------
                    
                    """;

        String dice3 = """
                     -------
                    |       |
                    |       |
                    |       |
                     -------
                    
                    """;

        String dice4 = """
                     -------
                    |       |
                    |       |
                    |       |
                     -------
                    
                    """;

        String dice5 = """
                     -------
                    |       |
                    |       |
                    |       |
                     -------
                    
                    """;

        String dice6 = """
                     -------
                    |       |
                    |       |
                    |       |
                     -------
                    
                    """;
            }
    }


