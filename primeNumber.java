import java.util.Scanner;

public class primeNumber {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = input.nextInt();


        if(num ==2 || num==3){
            System.out.print(num + (" is a prime number"));
        }else if(num % 2 == 0 || num % 3 == 0){
            System.out.println(num + " not a prime number");

        }



    }
}
