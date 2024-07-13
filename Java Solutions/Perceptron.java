import java.text.*;
import java.util.*;
public class Perceptron{
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
        int out=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                count++;
                out=out+count; 
                continue;
            }if(a[i]<a[i-1]){
                int x=i;
                count=1;
                int z=1;
                while(x+1<n){ 
                    while(a[x+1]<a[x]){
                        z++;
                        count=((z+1)*(z+2))/2 -1;
                        x++;
                    }
                }
                i=x;
                out=out+count;
                continue;
            }if(a[i]==a[i-1]){
                out++;
                continue;
            }
        }
        return out;
    }
}
