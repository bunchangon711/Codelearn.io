import java.util.Arrays;
import java.util.Scanner;

public class sortByHeight {
    static int[] answer(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] != -1 && arr[j] < arr[i]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(answer(arr)));
        sc.close();
    }
}
