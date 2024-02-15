import java.util.*;

public class differentSubstringsTrie {
    static int answer (String s) {
        ArrayList<String> differentS = new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                if(!differentS.contains(s.substring(i, j))){
                    differentS.add(s.substring(i, j));
                }
            }
        }
        for(String test: differentS){
            System.out.println(test);
        }
        return differentS.size();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(answer(s));
        sc.close();
    }
}
