import java.util.Scanner;

public class longestSequence {
    static int answer(int[] sequence){
        if(sequence.length == 1){
            return 1;
        }
        int max = 0;
        int diff = 0;
        for(int i=0;i<sequence.length;i++){
            for(int j=i+1;j<sequence.length;j++){
                int count = 2;
                diff = sequence[j] - sequence[i];
                int currentProgression = sequence[j];
                for(int k=j+1;k<sequence.length;k++){
                    if(sequence[k] == currentProgression + diff){
                        currentProgression = sequence[k];
                        count++;
                    }
                }
                if(count>max){
                    max = count;
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sequence = new int[n];
        for(int i=0;i<sequence.length;i++){
            sequence[i] = sc.nextInt();
        }
        System.out.println(answer(sequence));
        sc.close();
    }
}
