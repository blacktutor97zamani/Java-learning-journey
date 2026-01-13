public class recursion{
//Recursion in java is when a method or code 
//calls itself. This reduces repeatition if processes and
//speedens production. 

//creating a recursive method 
public static int sum(int a){
    if(a == 0){
        return 0;
}else { 
    return a + sum(a -1);
}
}

    public static void main(String[] args) {
    int z = sum(10);
    System.Out.Println(z);
}
}