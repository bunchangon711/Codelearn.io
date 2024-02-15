import java.util.*;

public class checkEqualFrequency{
    
    static boolean check(int[] inputArray) {
        Arrays.sort(inputArray);
        ArrayList<Integer> count = new ArrayList<Integer>();
        count.add(1);
        int arrayCount = 0;
        for(int i=0;i<inputArray.length-1;i++){
            if(inputArray[i] == inputArray[i+1]){
                count.set(arrayCount, (int)(count.get(arrayCount))+1);
            }
            if(inputArray[i] != inputArray[i+1]){
                arrayCount++;
                count.add(1);
            }
        }
        for(int i=0;i<count.size()-1;i++){
            if(count.get(i) != count.get(i+1)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));
        sc.close();
    }
}