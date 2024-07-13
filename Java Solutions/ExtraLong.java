import java.text.*;
import java.util.*;
public class ExtraLong {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long a=1;
        for(int i=1;i<n+1;i++){
            a=a*i;
        }
        System.out.println(a);
    }
}
