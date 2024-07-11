//Bilal Ahmad
import java.util.*;
public class SuperReducedString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        in.close();
        String t=superReduced(s);
        System.out.println(t);
    }
    public static String superReduced(String s) {
        for(int i=0;i<s.length()-1;i++){
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            if(a==b){
                s=s.substring(0,i) + s.substring(i+2);
                i--;
                
            }
        }
        //int a=s.length();
        if(s.length()==0){
            return "Empty String";
        }else{
            return s;
        }
    }
}
