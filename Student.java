public class Student {
    //This lesson is based on Java constructors
    String name = "Kwame";
    int year = 2022;
    String Course = "Computer Science";

    //with the above declared class variable, any instance of the class we create
    // adopts same variables unless we create a constructor.

    Student(String a, int b, String c){
        this.name = a;
        this.year = b;
        this.Course = c;
    }

    void study(){
        System.out.println("Student is Studying.....");
    }

    void sleeping(){
        System.out.println("Student is sleeping ");
    }

    public static void main(String[] a){

        //All the instances(student 1 and 2) created have same values.
        //Second edit: Created a constructor and added parameters to pass different arguments.
        Student student1 = new Student("Yussif", 2002, "General Arts");
       // student1.name;
        //student1.Course;
        System.out.println(student1.name + "\n" + student1.year);

        Student student2 = new Student("Mohammed", 2014, "General Science");
        // student1.name;
        //student1.Course;
        System.out.println(student2.name + "\n" + student2.year);
    }
}
