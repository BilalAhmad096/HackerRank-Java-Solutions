import java.text.*;
import java.util.*;
public class Clouds {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int x=jumpingJhapak(n,a,k);
        System.out.println(x);
    }
    static int jumpingJhapak(int n,int[] a, int k) {
        int b=0;
        for(int i=0;i<n-1;i++){
            if(a[i]==0 && a[i+1]==1){
                b+=3;
                continue;
            }if(a[i]==1 && a[i+1]==0){
                b+=1;
                continue;
            }else{
                continue;
            }
            
        }
        return(100-b);  
    }
}
