import java.text.*;
import java.util.*;

public class Solution {
    static int answer(int a[],int h){
        Arrays.sort(a);
        max=a[n-1];
        int d=max-h;
        if(d<0){
            return 0;
        }else{
            return d;
        }
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int h=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int d = answer(n, a[]);
        System.out.println(d);
    }
}
