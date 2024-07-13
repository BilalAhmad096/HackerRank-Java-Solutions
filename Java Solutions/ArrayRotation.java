import java.text.*;
import java.util.*;
public class ArrayRotation{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int q=in.nextInt();
        int[] a=new int[n];
        int[] b=new int[q];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=in.nextInt();
        }
        int temp=a[0];
        int c=0;
        for(int i=0;i<k;i++){
            for(int j=0;j<n-1;j++){
                c=a[j+1];
                a[j+1]=temp;
                temp=c;
            }
            a[0]=temp;;
        }
        for(int i=0;i<q;i++){
            System.out.println(a[b[i]]);
        }
        
    }
}
