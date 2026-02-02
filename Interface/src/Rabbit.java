public class Rabbit implements Prey{

    String name;

    Rabbit(String name ){
        this.name = name;
    }


    @Override
    public void flee(){
        System.out.println("Running");
    }

    @Override
    public void display(){
        System.out.println("The " + this.name + " is running");

    }
}
