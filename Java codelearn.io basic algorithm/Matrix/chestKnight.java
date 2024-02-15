import java.util.*;

public class chestKnight {
    static int column(String piece){
        int i = piece.charAt(0) - 'a' + 1;
        return i;
    }
    static int row(String piece){
        int i = Character.getNumericValue(piece.charAt(1));
        return i;
    }
    static int answer(String knight){
        knight = knight.toLowerCase();
        int[] preRow = {1,1,-1,-1,2,-2,2,-2};
        int[] preColumn = {2,-2,2,-2,1,1,-1,-1};
        int count = 0;
        for(int i=0;i<8;i++){
            if(column(knight)+preColumn[i]<=8 && row(knight)+preRow[i]<=8 && column(knight)+preColumn[i]>=1 && row(knight)+preRow[i]>=1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String knight = sc.next();
        System.out.println(answer(knight));
        sc.close();
    }
}
