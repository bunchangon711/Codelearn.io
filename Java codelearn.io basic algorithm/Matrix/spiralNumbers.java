import java.util.*;
import java.lang.Math;

public class spiralNumbers {
    static int column(int c, char direction){
        if(direction == 'r'){
            c++;
        }
        if(direction == 'l'){
            c--;
        }
        return c;
    }
    static int row(int r, char direction){
        if(direction == 'd'){
            r++;
        }
        if(direction == 'u'){
            r--;
        }
        return r;
    }
    static int[][] answer(int n){
        int r = 0;
        int c = 0;
        char direction = 'r';
        int[][] answer = new int[n][n];
        for(int j=1;j<=Math.pow(n, 2);j++){
            answer[r][c] = j;
            if(row(r, direction) >= n || column(c, direction) >= n || row(r, direction) < 0 || column(c, direction) < 0 || answer[row(r, direction)][column(c, direction)] != 0){
                switch(direction){
                    case 'r':
                        direction = 'd';
                        break;
                    case 'd':
                        direction = 'l';
                        break;
                    case 'l':
                        direction = 'u';
                        break;
                    case 'u':
                        direction = 'r';
                        break;
                }
                System.out.println(direction);
            }
            r = row(r, direction);
            c = column(c, direction);
            for(int k=0;k<answer.length;k++){
                for(int l=0;l<answer[k].length;l++){
                    System.out.print(answer[k][l] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.deepToString(answer(n)));
        sc.close();
    }    
}
