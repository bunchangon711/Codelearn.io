import java.util.*;

public class prefixSums {
    static int[] answer(int[] a){
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            int sum =0;
            for(int j=0;j<=i;j++){
                sum += a[j];
            }
            b.add(sum);
        }
        int[] convertList = new int[b.size()];
        for(int i=0;i<convertList.length;i++){
            convertList[i] = b.get(i);
        }
        return convertList;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(answer(a)));
        sc.close();
    }
}
