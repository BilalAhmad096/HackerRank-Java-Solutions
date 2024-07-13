import java.math.*;
import java.text.*;
import java.util.*;
public class Klopp{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int max=0;
        int[] b=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int c=Math.abs(a[j]-a[i]);
                if(c<=1){
                    count++;
                }
            } 
            if(count>max){
            max=count;
            }
            count=0;
        }
        
        System.out.println(max);
    }
}
