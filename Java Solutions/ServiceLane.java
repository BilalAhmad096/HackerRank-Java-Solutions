import java.text.*;
import java.util.*;

public class ServiceLane {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int t=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<t;i++){
            int start=in.nextInt();
            int stop=in.nextInt();
            int min=100;
            for(int j=start;j<stop+1;j++){
                if(min>a[j]){
                    min=a[j];
                }
            }
            System.out.println("The car size that can pass is: "+min);
        }
    }
}
