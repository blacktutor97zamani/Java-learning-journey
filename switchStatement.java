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
        /*
        String result = "";
        switch(days){
            case "mondays", "tuesday" -> result = "Wake up at 5am";
            case "friday" -> result = "Wake up at 6am";
            default -> result =  "Wake up at 6:30am";
        }

        System.out.println(result);

         */

        //**********Update 2****************
        //Incase you want to use ":" instead of "->" the you introduce the yield

        String result = "";
        result =switch(days) {
            case "mondays", "tuesday":
                yield "Wake up at 5am";
            case "friday":
                yield "Wake up at 6am";
            default:
                yield "Wake up at 6:30am";
        };

        System.out.println(result);

    }
}
