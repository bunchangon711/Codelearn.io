import java.util.*;

public class differentSquares {
    static int answer(int[][] matrix) {
        List<String> count = new ArrayList<String>();
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[i].length-1;j++){
                String square = "";
                square = square + String.valueOf(matrix[i][j]) + String.valueOf(matrix[i][j+1]) + String.valueOf(matrix[i+1][j]) + String.valueOf(matrix[i+1][j+1]);
                if(!count.contains(square)){
                    count.add(square);
                }
            }
        }
        return count.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] matrix = new int[n][k];
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(answer(matrix));
        sc.close();
    }
}
