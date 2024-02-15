import java.util.Scanner;
import java.lang.Math;

public class insideCircle {
    static boolean answer(int[] point, int[] center, int radius){
        double distance = Math.sqrt(Math.pow(center[0]-point[0], 2)+Math.pow(center[1]-point[1], 2));
        if(distance <= radius){
            return true;
        }
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] point = new int[2];
        int[] center = new int[2];
        for(int i=0;i<point.length;i++){
            point[i] = sc.nextInt();
        }
        for(int i=0;i<center.length;i++){
            center[i] = sc.nextInt();
        }
        int radius = sc.nextInt();
        System.out.println(answer(point, center, radius));
        sc.close();
    }
    
}
