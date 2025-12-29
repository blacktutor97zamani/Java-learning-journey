import java.sql.SQLOutput;
import java.util.Scanner;

/**
*This program performs some mathematical computations and displays the
 * results. It also displays the value of the constant MATH.PI. It then
 * reports the number of seconfs that the computer spent on this
 * task.
*/

public class timedComputation {
    public static void main(String [] args){
        long startTime; //Starting time of program, in nanoseconds.
        long endTime; //Time when computation ends.
        long compTime; //Runtime in nanoseconds
        double seconds; // Time difference, in seconds.

        startTime = System.nanoTime(); // calling the nanoTime() function from system class
        double width, height, hypothenuse; // Side of a triangle;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Width: ");
        width = scanner.nextDouble();
        //scanner.nextLine(); //clear the scanner

        System.out.print("Enter Height: ");
        height = scanner.nextDouble();

        scanner.close();
        System.out.print("Hyphotenuse = ");
        System.out.println(hypothenuse = Math.sqrt(width*width + height*height));

        System.out.println("A triangle with sides " +height+ " and " + width + " has a hypothenuse of " + hypothenuse);

        System.out.println("Mathematically, sin(x) * sin(x) + " +
                "cos(x) * cos(x) -1 should be 0");

        System.out.println("Let's check this for x = 100 ");

        System.out.print("sin(100) * sin(100) + " +
                "cos(100) * cos(100) -1 is : ");
        System.out.println(Math.sin(100)*Math.sin(100) +
                Math.cos(100) + Math.cos(100) - 1 );

        System.out.println("There can be run off errors when computing with " +
                "real numbers.");

        System.out.print("\nHere is a random number: ");
        System.out.println(Math.random());

        System.out.print("\nThe value of PI is: ");
        System.out.println(Math.PI);

        endTime = System.nanoTime();
        compTime = endTime - startTime;
        seconds = compTime / 100_00_00_00_0.0;

        System.out.print("\n Run time in nanoseconds is : ");
        System.out.println(compTime);

        System.out.print("\nRun time in seconds was: ");
        System.out.println(seconds);



    }
}
