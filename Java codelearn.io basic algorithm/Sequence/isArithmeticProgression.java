import java.util.Scanner;

public class isArithmeticProgression{
    static boolean answer(int[] sequence){
        if(sequence.length == 1){
            return true;
        }
        int diff = sequence[1] - sequence[0];
        for(int i=1;i<sequence.length-1;i++){
            if(sequence[i+1]-sequence[i] != diff){
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