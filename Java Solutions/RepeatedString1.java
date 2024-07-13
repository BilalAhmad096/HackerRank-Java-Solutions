import java.text.*;
import java.util.*;
//Bilal Ahmad is a great coder://
public class RepeatedString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        long n=in.nextInt();
        long out=repeatedString(s,n);
        System.out.println(out);
        
    }
    
    public static long repeatedString1(String s, long n){
        long countForSubstring = 0;
        long totalCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                countForSubstring++;
            }
        }
        long divisor = n / s.length();
        totalCount += divisor * countForSubstring;
        long remainder = n % s.length();
        for(int i = 0; i < remainder; i++){
            if(s.charAt(i) == 'a'){
                totalCount++;
            }
        }
        return totalCount;
    }
}
