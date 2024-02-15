import java.util.*;

public class differentSymbolsNaive {
    static int answer(String s) {
        ArrayList<String> uniqueChar = new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            if(!uniqueChar.contains(s.charAt(i)+"")){
                uniqueChar.add(s.charAt(i)+"");
            }
        }
        for(String i:uniqueChar){
            System.out.println(i);
        }
        return uniqueChar.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(answer(s));
        sc.close();
    }
}
