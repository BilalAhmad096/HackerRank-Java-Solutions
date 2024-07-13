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
    
    public static long repeatedString(String s, long n) {
        int k=0;
        long bahar=0;
        for(int i=0;i<n;i++){
            if(k>s.length()-1){
                k=0;
            }
            if(s.charAt(k)=='a'){
                bahar++;
            };
            k++;
            
        }
        return bahar;
    }
}
