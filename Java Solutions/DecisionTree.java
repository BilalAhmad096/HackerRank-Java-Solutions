import java.text.*;
import java.util.*;
public class DecisionTree{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int x=danish(a,n);
        System.out.println(x);
        
    }
    static int danish(int a[],int n){
        int[] z=new int[n];
        int[] y=new int[n];
        for(int i=0;i<n;i++){
            z[i]=1;
            y[i]=1;
        }
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                z[i]=z[i-1]+1;
                continue;
            }if(a[i]==a[i-1]){
                z[i]=1;
            }
        }
        for(int i=n-1;i>0;i--){
            if(a[i-1]>a[i]){
                y[i-1]=z[i]+1;
                continue;
            }if(a[i-1]==a[i]){
                z[i-1]=1;
                continue;
            }
        }
        int[] c=new int[n];
        for(int i=0;i<n;i++){
            if(z[i]>y[i]){
                c[i]=z[i];
                continue;
            }if(y[i]>=z[i]){
                c[i]=y[i];
                continue;
            }
        }
        int out=0;
        for(int i=0;i<n;i++){
            out=out+c[i]; 
        }
        return out;
    }
}
