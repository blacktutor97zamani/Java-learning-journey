import java.util.Scanner;
public class dataTypes {
    /*
    * We have two main type of Data Types (Primitive and Reference Datatypes)
    * *****Primitive Data Types**************
    * Integer - {int , byte, short, long}
    * Float - { float and double}
    * Character
    * Boolean
    *
    * The range of values each type of primitive data type can take varies
    * int - 4bytes -2^16
    * long 8 bytes -2^64 to 2^64 - number of digits it can hold(over 18 quintillion)
    * short - 2 bytes
    * byte - 1 = -2^8-1 to 2^8-1 - number of digits it can hold(-128 to 127)
    *
    * float - 4 bytes
    * double - 8 bytes (default data type)
    * The float variable always has to end with "f" to be functional..
    * Double datatype does nor require an alphabet at the end.
    *
    * */

        //simple project on Data Types
        /*
        * Building a console program that
        * collects a student's details and test scores, processes
        * them and prints a summary report
        * */
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String name;
            char gender;
            String courseName;
            int studentID;

            double subjectScore1, subjectScore2, subjectScore3;
            //double total = subjectScore1 + subjectScore2 + subjectScore3;


            System.out.print("Enter Student Name: ");
            name = scanner.nextLine();

            System.out.println("Gender: M / F");
            gender = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.println("Student ID");
            studentID = scanner.nextInt();
            scanner.nextLine(); //consume leftover newline


            System.out.println("Course Name: ");
            courseName = scanner.nextLine();


            System.out.println("Subject Score: ");
            subjectScore1 = scanner.nextDouble();

            System.out.println("Subject Score: ");
            subjectScore2 = scanner.nextDouble();

            System.out.println("Subject Score: ");
            subjectScore3 = scanner.nextDouble();

            double total = subjectScore1 + subjectScore2 + subjectScore3;
            double average = total / 3;
            double percentage = (total / 300) * 100;

            System.out.println("\n----- Student Report -----");
            System.out.println("Name: " + name);
            System.out.println("ID: " + studentID);
            System.out.println("Gender: " + gender);
            System.out.println("Course: " + courseName);

            System.out.printf("Total: %.2f\n", total);
            System.out.printf("Average: %.2f\n", average);
            System.out.println("Percentage: %.2f\n", percentage);


        }

}
