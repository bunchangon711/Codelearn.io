import java.util.Scanner;

public class isMonotonous{
    static boolean answer(int[] sequence){
        if(sequence.length == 1){
            return true;
        }
        boolean increase = false;
        boolean decrease = false;
        for(int i=0;i<sequence.length-1;i++){
            if(sequence[i+1] > sequence[i]){
                increase = true;
            }
            else if(sequence[i+1]<sequence[i]){
                decrease = true;
            }
            else return false;
            if(increase && decrease){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sequence = new int[n];
        for(int i=0;i<n;i++){
            sequence[i] = sc.nextInt();
        }
        System.out.println(answer(sequence));
        sc.close();
    }
}