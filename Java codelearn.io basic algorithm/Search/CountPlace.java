import java.util.*;
import java.lang.Math;

public class CountPlace {
    static int answer(int[] a, int k){
        ArrayList<Integer> noWifi = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            noWifi.add(a[i]);
        }
        int count = 0;
        while(!noWifi.isEmpty()){
            int pos = 0;
            int distanceLeft = k*2;
            if(noWifi.get(Math.min(pos+1, noWifi.size()-1))-noWifi.get(pos)>k || noWifi.get(Math.min(pos+1, noWifi.size()-1))-noWifi.get(pos) == 0){    //Remove the house that doesnt have any house inside the wifi diameter
                noWifi.remove(pos);
                count++;
                continue;
            }
            while(!noWifi.isEmpty() && noWifi.get(Math.min(pos+1, noWifi.size()-1))-noWifi.get(pos)<=k){        //Remove the houses that 1 wifi router can reach in 1 bulk
                distanceLeft -= noWifi.get(Math.min(pos+1, noWifi.size()-1))-noWifi.get(pos);
                noWifi.remove(pos);
                if(distanceLeft < noWifi.get(Math.min(pos+1, noWifi.size()-1))-noWifi.get(pos) || noWifi.get(Math.min(pos+1, noWifi.size()-1))-noWifi.get(pos) == 0){
                    noWifi.remove(pos);
                    break;
                }
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(answer(arr, k));
        sc.close();
    }
}
