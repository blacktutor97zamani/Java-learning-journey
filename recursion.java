public class recursion {
    int x;
    public static int sum (int x) {
        if(x > 0){
            return x + sum(x-1);

        } else{
            return 0;
        }
    }
    public static void main(String[] arg){
        int result = sum(10);
        System.out.println(result);
    }
}