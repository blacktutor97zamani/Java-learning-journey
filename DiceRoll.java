import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] arg){
        //Declare Variables
        //User Input
        //Dice Roll
        //ASCII representation of dice
        int total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of Dice: ");
        int numberOfDice = scanner.nextInt();

        Random random = new Random();


        for(int i = 1; i <= numberOfDice; i++ ){
            int roll = random.nextInt(1,7);
            System.out.print("Dice"+ i + " = " + roll + "\n");
            printDie(roll);
            total +=roll;
            System.out.println(total);
        }

    }

    public static void printDie(int roll){
            String dice1 = """
                     -------
                    |       |
                    |   ●   |
                    |       |
                     -------
                    
                    """;

        String dice2 = """
                     -------
                    | ●     |
                    |       |
                    |     ● |
                     -------
                    
                    """;

        String dice3 = """
                     -------
                    |●      |
                    |   ●   |
                    |      ●|
                     -------
                    
                    """;

        String dice4 = """
                     -------
                    | ●   ● |
                    |       |
                    | ●   ● |
                     -------
                    
                    """;

        String dice5 = """
                     -------
                    |●     ●|
                    |   ●   |
                    |●     ●|
                     -------
                    
                    """;

        String dice6 = """
                     -------
                    |●     ●|
                    |●     ●|
                    |●     ●|
                     -------
                    
                    """;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);

        }
            }
    }


