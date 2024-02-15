import java.util.*;
import java.lang.Math;

public class bishopDiagonal{
    static int columnToInt(String piece){
        return piece.charAt(0) - 'a' +1;
    }
    static boolean isDiagonal(String b1, String b2){
        if(Math.abs(columnToInt(b1) - columnToInt(b2)) == Math.abs(Character.getNumericValue(b1.charAt(1)) - Character.getNumericValue(b2.charAt(1)))){
            return true;
        }
        else return false;
    }
    static String[] answer(String b1, String b2){
        b1 = b1.toLowerCase();
        b2 = b2.toLowerCase();
        if(b1.charAt(0) > b2.charAt(0)){
            String tmp = b1;
            b1 = b2;
            b2 = tmp;
        }
        if(isDiagonal(b1, b2)){
            if(b1.charAt(0) < b2.charAt(0) && Character.getNumericValue(b1.charAt(1)) > Character.getNumericValue(b2.charAt(1))){
                while(b1.charAt(0) > 'a' && b1.charAt(0) < 'h' && b1.charAt(1) > '1' && b1.charAt(1) < '8'){
                    char tmp = b1.charAt(0);
                    tmp -=1;
                    b1 = b1.replace(b1.charAt(0), tmp);
                    b1 = b1.replace(b1.charAt(1), Character.forDigit(Character.getNumericValue(b1.charAt(1))+1, 10));
                }
                while(b2.charAt(0) > 'a' && b2.charAt(0) < 'h' && b2.charAt(1) > '1' && b2.charAt(1) < '8'){
                    char tmp = b2.charAt(0);
                    tmp +=1;
                    b2 = b2.replace(b2.charAt(0), tmp);
                    b2 = b2.replace(b2.charAt(1), Character.forDigit(Character.getNumericValue(b2.charAt(1))-1, 10));
                }
            }
            if(b1.charAt(0) < b2.charAt(0) && Character.getNumericValue(b1.charAt(1)) < Character.getNumericValue(b2.charAt(1))){
                while(b1.charAt(0) > 'a' && b1.charAt(0) < 'h' && b1.charAt(1) > '1' && b1.charAt(1) < '8'){
                    char tmp = b1.charAt(0);
                    tmp -=1;
                    b1 = b1.replace(b1.charAt(0), tmp);
                    b1 = b1.replace(b1.charAt(1), Character.forDigit(Character.getNumericValue(b1.charAt(1))-1, 10));
                }
                while(b2.charAt(0) > 'a' && b2.charAt(0) < 'h' && b2.charAt(1) > '1' && b2.charAt(1) < '8'){
                    char tmp = b2.charAt(0);
                    tmp +=1;
                    b2 = b2.replace(b2.charAt(0), tmp);
                    b2 = b2.replace(b2.charAt(1), Character.forDigit(Character.getNumericValue(b2.charAt(1))+1, 10));
                }
            }
        }
        String[] answer = new String[2];
        answer[0] = b1;
        answer[1] = b2;
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String bishop1 = sc.next();
        String bishop2 = sc.next();
        System.out.println(Arrays.toString(answer(bishop1, bishop2)));
        sc.close();
    }
}
