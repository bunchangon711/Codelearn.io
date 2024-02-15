import java.util.*;

public class makeArrayConsecutive {
    static int[] answer(int[] a){
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            for(int j=a[i]+1;j<a[i+1];j++){
                list.add(j);
            }
        }
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
