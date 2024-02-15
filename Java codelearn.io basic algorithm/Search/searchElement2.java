import java.util.*;
import java.lang.Math;

public class searchElement2 {
    static int answer(int[][] a, int k){
        if(k > Math.pow(a.length, 2)){
            return -1;
        }
        ArrayList<Integer> unique = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(!unique.contains(a[i][j])){
                    unique.add(a[i][j]);
                }
            }
        }
        Collections.sort(unique);
        return unique.get(k-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[][] matrix = new int[k][k];
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        System.out.println(answer(matrix, n));
        sc.close();
    }
}
