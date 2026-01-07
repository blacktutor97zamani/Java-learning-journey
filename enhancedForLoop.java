public class enhancedForLoop {

    public static void main(String[] args) {

        //Array to store data of students
        int[] scores = {75, 82, 90, 68, 88};

        //Variable to store total of all student scores
        int total = 0;
        int highest = scores[0];
        int lowest = scores[0];

        System.out.println("Student Scores:");

        // Enhanced for loop
        for (int score : scores) {
            System.out.println(score);

            total += score;

            if (score > highest) {
                highest = score;
            }

            if (score < lowest) {
                lowest = score;
            }
        }

        double average = (double) total / scores.length;

        System.out.println("\nTotal Score: " + total);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
