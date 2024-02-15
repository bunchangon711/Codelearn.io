import java.util.Scanner;

public class countTriangles {
    static boolean isTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        if((x3-x2)*(y2-y1)!=(y3-y2)*(x2-x1)){       //xb-xa	  xc-xb   When this happens 3 points lined up
            return true;                                                //----- = ------
        }                                                               //yb-ya	  yc-yb
        else return false;
    }
    static int answer(int[] x, int[] y){
        int count = 0;
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                for(int k=j+1;k<x.length;k++){
                    if(isTriangle(x[i], y[i], x[j], y[j], x[k], y[k])){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            y[i] = sc.nextInt();
        }
        System.out.println(answer(x, y));
        sc.close();
    }
}
