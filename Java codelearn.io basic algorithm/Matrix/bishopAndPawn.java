import java.util.*;
import java.lang.Math;

public class bishopAndPawn{
    static int columnToInt(String piece){
        int i = piece.charAt(0) - 'a' + 1;
        return i;
    }
    static boolean answer(String bishop, String pawn){
        bishop = bishop.toLowerCase();
        pawn = pawn.toLowerCase();
        if(bishop.equals(pawn)){
            return false;
        }
        if(Math.abs(columnToInt(bishop)-columnToInt(pawn)) == Math.abs(Character.getNumericValue(bishop.charAt(1))-Character.getNumericValue(pawn.charAt(1)))){
            return true;
        }
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String bishop = sc.next();
        String pawn = sc.next();
        System.out.println(answer(bishop, pawn));
        sc.close();
    }    
}
