/*
 * Static variables are declared at the class level.
 * A static variable is shared among all objects created from the class.
 * Static variables do not require an object to be accessed.
 * It is best practice to access static variables using the class name
 * followed by the variable name (ClassName.variableName).
 * Static variables help reduce memory usage by avoiding duplicate copies
 * of the same data across objects.
 * Changing a static variable affects all instances of the class,
 * making it easy to update shared data from one place.
 * Note: Static variables are shared but are NOT thread-safe by default.
 */

class school{
    static String name = "Presby";
    String course;
    int year;


}
public class staticVariable {


    public static void main(String [] args){
       school std1  = new school();
       std1.course = "Computer Science";
       std1.year = 2024;
        System.out.println("Course: " + std1.course+ "\nYear: " + std1.year + "\nName: " + school.name);

    }
}
