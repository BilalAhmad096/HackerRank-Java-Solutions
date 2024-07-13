import java.text.*;
import java.util.*;

public class Tikka {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        long t=in.nextInt();
        for(long i=0;i<t;i++){
            long a=in.nextLong();
            long b=in.nextLong();
            long c=in.nextLong();
            long x=b%a;
            long y=c+(x-1); 
            
            if(y>a){
                long q=(y-a);
                System.out.println(q);
            }else{
                System.out.println(y);
            }
        }
    }
}
