import java.util.Scanner;

public class SimpleBankApp {
    static double balance = 0;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){
        double amount = 0;
        int choice;
        Boolean isRunning = true;


        while(isRunning){
            //Banking App Name
            System.out.println("**********************************");
            System.out.println("Bank Application");
            System.out.println("**********************************");


            System.out.println("1. Deposit \n" +
                    "2. Withdraw \n" +
                    "3. Account Balance \n" +
                    "4. Exit ");
            System.out.print("Choose your choice (1-4): ");
            choice = scanner.nextInt();


            
            switch(choice){
                case 1 -> balance += deposit(amount);
                case 2 -> balance -= withdraw();
                case 3 -> AccountBalance(balance);
                case 4 -> isRunning = false;
            }
        }





        //exit


        scanner.close();
    }
    //Deposit
    static double deposit(double amount){
        if(amount < 0){
            System.out.println("Invalid Amount. Please try again.");
        }
        else{
            System.out.print("Enter Amount to deposit: ");
            amount = scanner.nextDouble();
            System.out.println("Your current balance is " + (balance + amount) +" Ghc.");
            System.out.println("*****************************************************");

        }
        return amount;

    }

    //Withdraw
    public static double withdraw(){
        System.out.print("Enter Amount to Withdraw: ");
        double amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Invalid Amount");
        }

        else if(amount > balance){
            System.out.println("Insufficient Balance");
        }

        else{
            System.out.println(amount + "Ghc Successfully withdrawn");
            return amount;
        }

        return amount;
    }

    //Account Balance
    public static void AccountBalance(double balance){
        System.out.println("Your account balance is : " + balance + " Ghc");
    }


}

