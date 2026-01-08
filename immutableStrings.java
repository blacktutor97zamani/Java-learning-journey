/*
* In java, Strings are immutable, meaning values set cannot be
* changed once created. If you try modifying values using concat or replace
* a new String object is created in the String Constant pool instead of altering
* the old value.
*
* So the register address for the object is changed to direct to
* the modified value in the String Constant Pool
* This allows reuse of the objects and reduces memory overhead.
*
* */
public class immutableStrings {
    public static void main(String [] arg){

        // Both V1 and V2 refer to the same string literal in  the
        // string pool.

        String v1 = "Hello";
        String v2 = "Hello";

        //both v1 and v2 point to same objects in the string pool
        System.out.println("v1 == v2: " + (v1 == v2));

        //Concatenation creates a new String object in heap,
        // v1 points to it
        v1 = v1.concat(" World");

        System.out.println("V1 == V2: " + (v1 == v2));

        //creating a string using the new keyword store it in the
        //heap
        String v3 = new String("Hello");

        //the code below is false, because v2 is no is from
        //String pool and v3 is from heap.
        System.out.println("v2 == v3: " + (v2 == v3));

        // the code below is true, because equals() compares content
        System.out.println("v2.equals(v3): " + v2.equals(v3));


    }
}
