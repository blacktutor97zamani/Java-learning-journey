public class Animal {
    String name;
    String age;
    boolean isAlive = true;

    Animal(String name, String age){
        this.name = name;
        this.age = age;

    }
    void eat(){
        System.out.println("The" + this.name + " is eating");
    }

}
