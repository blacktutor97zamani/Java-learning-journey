public class Lion implements Predator{

    String name;

    Lion(String name){
        this.name = name;
    }

    @Override
    public void Hunt(){
        System.out.println("Hunting");

    };

    @Override
    public void display(){
        System.out.println("The " + this.name + " is Hunting..");
    };
}
