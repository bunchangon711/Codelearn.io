import java.util.Arrays;
import java.util.Scanner;

public class digitalSumSort {
    static int ditgitSum(int number){
        int sum = 0;
        String s = String.valueOf(number);
        for(int i=0;i<s.length();i++){
            sum += Character.getNumericValue(s.charAt(i));
        }
        return sum;
    }
    static int[] answer(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(ditgitSum(arr[j]) < ditgitSum(arr[i]) || ditgitSum(arr[j]) == ditgitSum(arr[i]) && arr[j] < arr[i]){
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
