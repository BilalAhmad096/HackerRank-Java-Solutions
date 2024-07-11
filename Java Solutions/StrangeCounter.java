import java.util.*;
//Bilal Ahmad is a great coder:
public class StrangeCounter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long t=in.nextLong();
        long ret=strangeCounter(t);
        System.out.println(ret);
        in.close();
                
    }
    public static long strangeCounter(long t) {
        int count=0;
        long c=3;
        long b=0;
        for(int i=0;i<10;i++){
            b=c+3*i;
            count++;
            if(t<=b){
                break;
                 
            }
            c=b;
            i++;
        }
        if(t<4){
            c=0;
        }
        long lrange=c+1;
        long hrange=b;
        long a1=0;
        long d1=3;
        long max=0;
        for(int i=0;i<count;i++){
            a1=2*d1;
            d1=a1;
            max=a1/2;
        }
        System.out.println(lrange);
	    System.out.println(hrange);
	    System.out.println(max);
        long waapsi=0;
        for(long i=lrange;i<=hrange;i++){
            if(i==t){
                waapsi= max;
            }
            max--;
            
        }
        return waapsi;
        
    }
}
