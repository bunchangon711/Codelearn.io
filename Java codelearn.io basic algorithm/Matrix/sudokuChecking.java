import java.util.Scanner;

public class sudokuChecking {
    static boolean isOnly(char[][] grid, int row, int column){
        for(int i=0;i<9;i++){ //Check row
            if(i == column){
                continue;
            }
            if(grid[row][i] == grid[row][column]){
                return false;
            }
        }
        for(int i=0;i<9;i++){ //Check column
            if(i == row){
                continue;
            }
            if(grid[i][column] == grid[row][column]){
                return false;
            }
        }
        for(int i=Math.max(0, row-1); i<=Math.min(8, row+1); i++){   //Check 3x3 Square
            for(int j=Math.max(0, column-1); j<=Math.min(8, column+1); j++){
                if(i == row && j == column){
                    continue;
                }
                if(grid[i][j] == grid[row][column]){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean answer(char[][] grid){
        if(grid == null || grid.length != 9 || grid[0].length != 9){
            return false;
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(grid[i][j] != '.' && !isOnly(grid, i, j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] grid = new char[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                grid[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println(answer(grid));
        sc.close();
    }
}
