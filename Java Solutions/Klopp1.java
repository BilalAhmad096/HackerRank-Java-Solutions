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
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int c=Math.abs(a[i]-a[j]);
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
