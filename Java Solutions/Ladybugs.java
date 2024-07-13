import java.text.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int g=in.nextInt();
        for(int i=0;i<g;i++){
            int n=in.nextInt();
            String a=in.next();
            String out=happyLadybugs(a);
            System.out.println(out);
        }
        in.close();
    }
    public static String happyLadybugs(String a) {
        int q=a.length();
        char[] w=new char[q];
        for(int i=0;i<q;i++){
            w[i]=a.charAt(i);
        }
        System.out.println("The input String is:"+"\n");
        for(char k:w) System.out.print(k); 
        return "0";
    }

}
