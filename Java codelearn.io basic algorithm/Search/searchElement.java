import java.util.*;

public class searchElement{
    static int answer(int[] arr, int n){
        Arrays.sort(arr);
        if(n > arr.length){
            return -1;
        }
        ArrayList<Integer> unique = new ArrayList<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(!unique.contains(arr[i])){
                unique.add(arr[i]);
            }
            if(unique.size() == n){
                return unique.get(n-1);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] scoreList = new int[arrSize];
        for(int i=0;i<arrSize;i++){
            scoreList[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        System.out.println(answer(scoreList, n));
        sc.close();
    }
}