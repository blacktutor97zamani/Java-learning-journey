public class cat extends Animal{
    String breed;
    cat(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    void talk(){
        System.out.println("The " + this.name + " is 'meowing'.");
    }



}
