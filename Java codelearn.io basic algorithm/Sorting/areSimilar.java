import java.util.Arrays;
import java.util.Scanner;

public class areSimilar {
    static boolean answer(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        int[] origin = a.clone();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a = origin.clone();
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                if(Arrays.equals(a, b)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        System.out.println(answer(a, b));
        sc.close();
    }
}
