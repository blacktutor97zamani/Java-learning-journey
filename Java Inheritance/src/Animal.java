public class Animal {
    String name;
    int age;
    boolean isAlive = true;

    Animal(String name, int age){
        this.name = name;
        this.age = age;

    }
    void eat(){
        System.out.println("The" + this.name + " is eating");
    }

}
