public class switchStatement {
    /*
    *Java has updated its switch statements from the previous method to
    * a new easy and fast way without the use of break in between cases.
    */

    public static void main(String[] args){
        String days = "Wednesday";

        //Previous method
        /*
        switch (days){
            case "monday", "tuesday" :
                System.out.println("Wake up at 5am");
                break;
            case "friday":
                System.out.println("Wake up at 6am");
                break;
            default:
                System.out.println("Wake up at 6:30am");

        }

         */

        //***********New UPDATE*********************

        String result = "";
        switch(days){
            case "mondays", "tuesday" -> result = "Wake up at 5am";
            case "friday" -> result = "Wake up at 6am";
            default -> result =  "Wake up at 6:30am";
        }

        System.out.println(result);
    }
}
