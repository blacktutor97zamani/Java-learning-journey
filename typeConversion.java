/**
 *
 * @author Yussif Konda Mohammed
 * @github blacktutor97zamani
 *
 */

import java.util.Scanner;
public class typeConversion {
    /*
     * Building a small console application
     * that allows a user to choose different conversion
     * operations.
     * This covers:
     * Primitive Casting
     * Wrapper class Conversions
     * string - number parsing
     * error handling during conversion
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       int choice = 1;
        do{
            System.out.println("*******TYPE CONVERSION \n");
            System.out.println("1. Convert int to double ");
            System.out.println("2. Convert double to int ");
            System.out.println("3. Convert String to int");
            System.out.println("4. Convert int to String ");
            System.out.println("5. Convert char to ASCII ");
            System.out.println("6. Convert ASCII to char");
            System.out.println("7. EXIT");

            System.out.println("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); //clearing the buffer

            switch(choice){
                case 1:
                    System.out.print("Enter an Integer: ");
                    int intValue = scanner.nextInt();
                    double convertedDouble = intValue;
                    System.out.println("Converted double value = " + convertedDouble);
                    break;

                case 2:
                    System.out.print("Enter a double value: ");
                    double doubleValue = scanner.nextDouble();
                    int intValue2 = (int)doubleValue; //explicit cast
                    System.out.println("Converted int value = " + intValue2);
                    break;

                case 3:
                    System.out.print("Enter a numeric String: ");
                    String str = scanner.nextLine();
                    try{
                        int number = Integer.parseInt(str);
                        System.out.println("Converted int value = " + number);
                    }catch(NumberFormatException e) {
                        System.out.println("Error: '" + str +"' is not a valid number.");
                    }
                    break;

                case 4:
                    System.out.println("Enter an integer: ");
                    int num2 = scanner.nextInt();
                    String stringValue = String.valueOf(num2);
                    System.out.println("Converted String value = " + stringValue);
                    break;


                case 5:
                    System.out.println("Enter a Character: ");
                    char ch = scanner.nextLine().charAt(0);
                    int ascii = (int) ch;
                    System.out.println("ASCII value = " + ascii);
                    break;

                case 6:
                    System.out.println("Enter an ASCII value: ");
                    int asciiValue = scanner.nextInt();
                    char character = (char) asciiValue;
                    System.out.println("Character = " + character);
                    break;

                case 7:
                    System.out.println("Exiting..... Goodbye");
                    break;


                default:
                    System.out.println("Invalid choice, try again!");




            }

        }while(choice != 7);

        scanner.close();
    }

}