public class multiDimensionalArrays {
    public static void main(String a[]){
        String[][] country = new String[5][2];

        country[0][0] = "Ghana";
        country[0][1] = "Accra";

        country[1][0] = "United State";
        country[1][1] = "Washington";

        country[2][0] = "Burkina";
        country[2][1] = "Ouagadougou";

        country[3][0] = "Egypt";
        country[3][1] = "Cairo";

        country[4][0] = "Nigeria";
        country[4][1] = "Lagos";

        for(int i = 0; i < country.length; i++){

            System.out.println("Country: " + country[i][0] +
                    ", Capital: " + country[i][1]);
        }
    }
}
