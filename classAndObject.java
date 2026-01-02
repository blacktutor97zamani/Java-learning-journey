import java.util.Scanner;
public class classAndObject {
    public class calc{
        int a;
        int b;
         public int add(int a, int b){
             return a +  b;
         }
    }


    public static void main(String[] args) {
        //creating an object from the class Scanner /util
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Nunber:");
        a = Scaanner.nextInt();

        System.out.print("Enter first Nunber:");
        b = Scaanner.nextInt();

        int result = sum(a,b);
        System.out.print("Result: " + result);

//this is an illustration of how classes and objects work hand in code processing 
    }
}


