import java.util.Scanner;

class vehicle {
    String companyName = "Zamani";

    public int num(int x, int y){

        int result = x + y;
        return result;
    }

    public String nameModel(String name, String carModel){
        return "you car is " + name + ". Your year model is " + carModel;
    }
}



public class methods {



    public static void main(String[] a){

        Scanner scan = new Scanner(System.in);

        System.out.print("Car Name: ");
        String carName = scan.nextLine();

        System.out.print("Model: ");
        String carModel = scan.nextLine();


        vehicle sum = new vehicle();

        String result = sum.nameModel(carName, carModel);

        System.out.println(result);



    }
}
