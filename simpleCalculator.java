import java.util.Scanner;

public class simpleCalculator {
    /*
    1. create methods for
    - Addition
    - Minus
    - Division
    - Multiplication
    2. Take values from user
     */

    public static int sum(int... numbers){
        int add = 0;
        for(int n : numbers){
            add += n;
        }

        return add;
    }

    public static void main(String[] args){

        int result = 0;
        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter number of Digits: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int[] numbers = new int[num];

        System.out.print("Enter character (+, -, /, *): ");
        char character = scanner.nextLine().charAt(0);

        switch(character){
            // *******************ADDITION*****************
            case '+':
                for(int i = 0; i < num; i++){
                    System.out.print("Enter number: ");
                    numbers[i] = scanner.nextInt();

                   // result = numbers[0];
                    result += numbers[i];

                    
                }
                System.out.println(result);

                break;

                //***************************************SUBTRACTION*****************************************

            case '-':
                for(int i = 0; i < num; i++){
                    System.out.print("Enter number: ");
                    numbers[i] = scanner.nextInt();

                    //result += numbers[i];
                }

                result = numbers[0];
                for(int i = 1; i < num; i++){
                    //System.out.print(j + " ");
                    result -= numbers[i];

                }
                System.out.println("Result: " + result);
              //System.out.println("Result Value: "+ result);

                break;


                //*******************************DIVISION**************************************
            case '/':
                for(int i = 0; i < num; i++){
                    System.out.println("Enter number: ");
                    numbers[i] = scanner.nextInt();
                }

                result = numbers[0];
                for(int i =1; i < num; i++){
                    if(numbers[i] == 0){
                        System.out.println("Cannot divide by Zero");
                        return;
                    }
                    result /= numbers[i];
                }
                System.out.println("Result: " + result);
                break;

            //**************************************MULTIPLICATION********************************************
            case '*':
                result = 1;
                for(int i = 0; i < num; i++){
                    System.out.print("Enter number: ");
                    numbers[i] = scanner.nextInt();
                    result *= numbers[i];
                }

                System.out.println("Result: " + result);
                break;

                
            //*******************************DEFAULT***************************************
            default:
                System.out.println("Invalid Operator");

        }



    }

}
