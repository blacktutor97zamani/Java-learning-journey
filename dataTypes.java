public class dataTypes {
    /*
    * We have two main type of Data Types (Primitive and Reference Datatypes)
    * *****Primitive Data Types**************
    * Integer - {int , byte, short, long}
    * Float - { float and double}
    * Character
    * Boolean
    *
    * The range of values each type of primitive data type can take varies
    * int - 4bytes -2^16
    * long 8 bytes -2^64 to 2^64 - number of digits it can hold(over 18 quintillion)
    * short - 2 bytes
    * byte - 1 = -2^8-1 to 2^8-1 - number of digits it can hold(-128 to 127)
    *
    * float - 4 bytes
    * double - 8 bytes (default data type)
    * The float variable always has to end with "f" to be functional..
    * Double datatype does nor require an alphabet at the end.
    *
    * */


        public static void main(String[] args){
            int a = 1123;
            byte b = 125;
            short c = 11;
            long l = 2390312;

            float d = 46.7f;
            double e = 47.7;

            System.out.println(a +"\n " + b +"\n " + c +"\n " + l+ "\n " );
        }

}
