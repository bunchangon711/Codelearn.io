import java.util.Scanner;
import java.lang.Math;

public class isRectangle {
    static boolean answer(int[][] sides){
        double Side1 = Math.pow(sides[1][0]-sides[0][0], 2) + Math.pow(sides[1][1]-sides[0][1], 2);
        double Side2 = Math.pow(sides[2][0]-sides[1][0], 2) + Math.pow(sides[2][1]-sides[1][1], 2);
        double Side3 = Math.pow(sides[3][0]-sides[2][0], 2) + Math.pow(sides[3][1]-sides[2][1], 2);
        double Side4 = Math.pow(sides[0][0]-sides[3][0], 2) + Math.pow(sides[0][1]-sides[3][1], 2);
        double diagonalLine = Math.pow(sides[2][0]-sides[0][0], 2)+Math.pow(sides[2][1]-sides[0][1], 2);
        if(Side1+Side2==diagonalLine && Side3+Side4==diagonalLine){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] sides = new int[4][2];
        for(int i=0;i<sides.length;i++){
            for(int j=0;j<sides[i].length;j++){
                sides[i][j] = sc.nextInt();
            }
        }
        System.out.println(answer(sides));
        sc.close();
    }
    
}
