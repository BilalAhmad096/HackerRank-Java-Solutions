import java.util.*;
//Bilal Ahmad is a great coder:\\
public class FunnyString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            String s=in.next();
            String out=funnyString(s);
            System.out.println(out);
        }
        in.close();
    }
    static String funnyString(String s) {
        String str=reverseString(s);
        for(int i=0;i<str.length()-1;i++){
            int k=Math.abs((str.charAt(i)-str.charAt(i+1)));
            int l=Math.abs((s.charAt(i)-s.charAt(i+1)));
            if(k!=l){
                return "Not Funny";
            }
        }
        return "Funny";
    }
    static String reverseString(String s){
        StringBuilder str = new StringBuilder();
        str.append(s);
        str.reverse();
        String reverse=str.toString();
        return reverse;
    }
}