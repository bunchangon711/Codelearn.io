import java.util.*;

public class isTournament{
    static boolean answer(int n, int[] fromV, int[] toV){
        if(fromV.length != toV.length){
            return false;
        }
        List<Integer> vertex = new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            vertex.add(i);
        }
        List<Integer> connectedTo = new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            connectedTo.clear();
            connectedTo.add(i);
            for(int j=0;j<fromV.length;j++){
                if(fromV[j] == i){
                    connectedTo.add(toV[j]);
                }
                else if(toV[j] == i){
                    connectedTo.add(fromV[j]);
                }
            }
            Collections.sort(connectedTo);
            if(!connectedTo.equals(vertex)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] fromV = new int[l];
        int[] toV = new int[l];
        for(int i=0;i<l;i++){
            fromV[i] = sc.nextInt();
        }
        for(int i=0;i<l;i++){
            toV[i] = sc.nextInt();
        }
        System.out.println(answer(n, fromV, toV));
        sc.close();
    }
}