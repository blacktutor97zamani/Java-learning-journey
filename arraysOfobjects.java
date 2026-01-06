public class arraysOfobjects {
    static class Students {
        String name;
        int age;
        double score;
    }

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.name = "Yussif";
        s1.age = 30;
        s1.score = 89.3;


        Students s2 = new Students();
        s2.name = "Moses";
        s2.age = 28;
        s2.score = 90.3;


        Students s3 = new Students();
        s3.name = "Yussif";
        s3.age = 26;
        s3.score = 96.3;

        Students student[] = new Students[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].name + " : " + student[i].score + " : " + student[i].age);
        }


    }
}
