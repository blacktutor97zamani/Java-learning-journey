public class arrays {
    public static void main(String[] ag){

        int[] arr = new int[5];
       // int fill = (int)(Math.random()*10);
        //System.out.println(fill);
        for(int i = 0; i < 5; i++){
            arr[i] = (int)(Math.random()*10);;
            int store = arr[i];

        }

        for(int i = 1; i < 5; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
