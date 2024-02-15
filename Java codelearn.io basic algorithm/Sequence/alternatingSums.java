import java.util.*;

public class alternatingSums {
    static int[] answer(int[] a){
        List<Integer> list = new ArrayList<Integer>();
        int weight1 = 0;
        int weight2 = 0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                weight1 += a[i];
            }
            else weight2 += a[i];
        }
        list.add(weight1);
        list.add(weight2);
        int[] b = new int[list.size()];
        for(int i=0;i<b.length;i++){
            b[i] = list.get(i);
        }
        return b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(answer(a)));
        sc.close();
    }
}
