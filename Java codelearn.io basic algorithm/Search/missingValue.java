import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class missingValue {
    static Integer[] answer(int[] a, int[] b){
        ArrayList<Integer> lsta = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            lsta.add(a[i]);
        }
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for(int i=0;i<b.length;i++){
            if(!lsta.contains(b[i])){
                lst.add(b[i]);
            }
        }
        Integer[] lstToArray = lst.toArray(new Integer[lst.size()]);
        return lstToArray;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        n = sc.nextInt();
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(answer(a, b)));
        sc.close();
    }
}
