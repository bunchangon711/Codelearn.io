import java.util.ArrayList;
import java.util.Scanner;

public class beautifulArray {
    static boolean answer(int[] arr){
        if(arr.length<=1){
            return false;
        }
        ArrayList<Integer> sumArray = new ArrayList<Integer>();
        sumArray.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            sumArray.add(sumArray.get(i-1)+arr[i]);      //Save the sum of every element including the current pos and everything behind it
        }                                                //so dont have to calculate the sum again in each iteration
        for(int i=1;i<arr.length;i++){
            if(sumArray.get(i-1) == (sumArray.get(arr.length-1) - sumArray.get(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(answer(arr));
        sc.close();
    }
}
