import java.util.Arrays;
import java.util.Scanner;

public class sortByLength {
    static String[] answer(String[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j+1].length() < arr[j].length()){
                    String tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        System.out.println(Arrays.toString(answer(arr)));
        sc.close();
    }
}
