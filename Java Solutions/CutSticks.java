import java.text.*;
import java.util.*;

public class CutSticks{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        } 
        int x=n;
	System.out.println("The Sequence is:");
        while(x>0){
            int q=0;
            int min=100;
            System.out.println(x);
            for(int i=0;i<n;i++){
                if(a[i]<min && a[i]>0){
                    min=a[i];
                }
            }
            for(int i=0;i<n;i++){
                a[i]=a[i]-min;
            }
            for(int i=0;i<n;i++){
                if(a[i]<1){
                    q++;
                }
            }
            x=n-q;
        }
    }
}
