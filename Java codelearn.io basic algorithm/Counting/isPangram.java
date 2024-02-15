import java.util.*;

public class isPangram {
    static boolean answer(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\s+", "");
        List<String> count = Arrays.asList(s.split(""));
        for(String test: count){
            System.out.println(test);
        }
        for(int i=(int)'a';i<(int)'z'+1;i++){
            if(count.contains(String.valueOf((char)i))){
                continue;
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(answer(input));
        sc.close();
    }    
}
