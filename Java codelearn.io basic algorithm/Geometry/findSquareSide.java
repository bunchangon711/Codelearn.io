import java.util.Scanner;
import java.lang.Math;

public class findSquareSide{
    static int answer(int[] x, int[] y){
        int a = (int)Math.pow(x[1]-x[0], 2) + (int)Math.pow(y[1]-y[0], 2);
        int b = (int)Math.pow(x[2]-x[0], 2) + (int)Math.pow(y[2]-y[0], 2);
        int c = (int)Math.pow(x[3]-x[0], 2) + (int)Math.pow(y[3]-y[0], 2);
        if(a==b){
            return a;
        }
        else return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x[] = new int[4];
        int y[] = new int [4];
        for(int i=0;i<x.length;i++){
            x[i] = sc.nextInt();
        }
        for(int i=0;i<y.length;i++){
            y[i] = sc.nextInt();
        }
        System.out.println(answer(x, y));
        sc.close();
    }
}