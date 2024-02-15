import java.util.Scanner;
import java.lang.Math;

public class findPath {
    static boolean pathFromOne(int[][] matrix, int row, int column, int end){
        int nextPath = 2;
        int upperBounds = 0;
        int lowerBounds = matrix.length-1;
        int leftBounds = 0;
        int rightBounds = matrix[0].length-1;
        while(matrix[row][column] != end){
            if(matrix[Math.max(upperBounds, row-1)][column] == nextPath){
                row = row-1;
            }
            else if(matrix[Math.min(lowerBounds, row+1)][column] == nextPath){
                row = row+1;
            }
            else if(matrix[row][Math.max(leftBounds, column-1)] == nextPath){
                column = column-1;
            }
            else if(matrix[row][Math.min(rightBounds, column+1)] == nextPath){
                column = column+1;
            }
            else return false;
            nextPath++;
        }
        return true;
    }
    static boolean answer(int[][] matrix){
        int end = matrix.length*matrix[0].length;
        for(int i=0;i<matrix.length;i++){   //Finding the position of the number 1 in array
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 1){
                    if(pathFromOne(matrix, i, j, end)){
                        return true;
                    }
                    else return false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            } 
        }
        System.out.println(answer(matrix));
        sc.close();
    }
}
