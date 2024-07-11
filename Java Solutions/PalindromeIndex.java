import java.util.*;
//Bilal Ahmad is a great coder:\\
//Chal nai raha hai yeh code poora
public class PalindromeIndex {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            String s=in.next();
            int out=palindrome(s);
            System.out.println(out);
        }
        in.close();
    }
    static int palindrome(String s) {
        for(int i=0;i<s.length();i++){
            String a=s.substring(0,i);
            String b=s.substring(i+1);
            a+=b;
            String str=reverseString(a);
            if(a.equals(str)) return i;
        }
        return -1;
        
    }
    static String reverseString(String s){
        StringBuilder str = new StringBuilder();
        str.append(s);
        str.reverse();
        String reverse=str.toString();
        return reverse;
    }
}
