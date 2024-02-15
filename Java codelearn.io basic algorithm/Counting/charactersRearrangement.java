import java.util.*;

public class charactersRearrangement {
    static boolean answer(String s1, String s2) {
        List<String> List1 = Arrays.asList(s1.split(""));
        List<String> List2 = Arrays.asList(s2.split(""));
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(Collections.frequency(List1, String.valueOf(s1.charAt(i))) == Collections.frequency(List2, String.valueOf(s1.charAt(i)))){
                continue;
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(answer(s1, s2));
        sc.close();
    }
}