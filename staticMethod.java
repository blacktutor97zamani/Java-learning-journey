/*
 * Static methods are methods defined at the class level.
 * They belong to the class, not to objects.
 * Static methods are called using the class name (ClassName.methodName).
 * They are different from instance (non-static) methods.
 * Static methods cannot directly access instance variables or instance methods.
 * They can only access static variables and static methods directly.
 * Instance members can be accessed inside a static method only by creating an object.
 * Static methods can accept parameters like normal methods.
 */



public class staticMethod {
    int x = 20 ; //instance variable

    static void show(){
        //to access the instance variable in the static method, we must first create an
        // object of the class in order to access the variable.
    staticMethod obj = new staticMethod();
        System.out.println(obj.x);
    }

    public static void main(String [] args){

        // your don't need to create an object before accessing the static method.
        //you just need the className.methodName();
        staticMethod.show();
    }
}
