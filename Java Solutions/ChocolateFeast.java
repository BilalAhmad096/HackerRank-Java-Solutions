import java.text.*;
import java.util.*;
//Bilal Ahmad is a great coder://
public class CholocateFeast {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int p=0;p<t;p++){
            int n=in.nextInt();
            int c=in.nextInt();
            int m=in.nextInt();
            int out=chocolateFeast(n,c,m);
            System.out.println("The number of chocolates eaten are: "+out);
        }
        in.close();
    }
    public static int chocolateFeast(int n, int c, int m) {
        int rem=n;
        int w=n/c;
        int ret=w;
        while(w>=m){
            int a=w/m;
            int b=w%m;
            ret+=a;
            w=a+b;
        }
        return ret;
    }
}
