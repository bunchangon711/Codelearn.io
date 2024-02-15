import java.util.*;

class chessBoardCellColor{
    /*static boolean answer(String c1, String c2) {
        c1 = c1.toLowerCase();
        c2 = c2.toLowerCase();
        int[][] chessBoard = new int[8][8];
        int[] isWhite = new int[2];
        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard[i].length;j++){
                if(i%2==0 && j%2==0 || i%2!=0 && j%2!=0){
                    chessBoard[i][j] = 1;
                }
                else chessBoard[i][j] = 0;
            }
        }
        for(int i=0;i<chessBoard.length;i++){
            for(int j='a';j<'i';j++){
                if((char)j == c1.charAt(0) && i+1 == Character.getNumericValue(c1.charAt(1))){
                    isWhite[0] = chessBoard[i][((int)j-97)];
                }
                if((char)j == c2.charAt(0) && i+1 == Character.getNumericValue(c2.charAt(1))){
                    isWhite[1] = chessBoard[i][((int)j-97)];
                }
            }
        }
        if(isWhite[0] == isWhite[1]){
            return true;
        }
        else return false;
    }*/
    static int checkColor(String cell){
        int x = cell.charAt(0) - 'A' + 1, y = cell.charAt(1) - '0';
        // viet lai form cua toa do (1 .. 8, 1 .. 8)
        return x % 2 == y % 2 ? 1 : 0;
        // 1 la black, 0 la white
    }
    static boolean answer(String c1, String c2){
        if(checkColor(c1) != checkColor(c2)){
            return false;
        }
        else return true;
    }    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        String c2 = sc.next();
        System.out.println(answer(c1, c2));
        sc.close();
    }
}