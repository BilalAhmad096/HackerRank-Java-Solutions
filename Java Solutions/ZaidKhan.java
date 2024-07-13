import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class ZaidKhan{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int b=in.nextInt();
        int n=in.nextInt();
        int m=in.nextInt();
        int[] c=new int[n];
        int[] d=new int [m];
        for(int i=0;i<n;i++){
            c[i]=in.nextInt();
        }
        for(int i=0;i<m;i++){
            d[i]=in.nextInt();
        }
        int k=0;
        int a=n*m;
        int[] e=new int[a];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                e[k]=c[i]+d[j];
                k++;
            }
        }
        Arrays.sort(e);
        if(e[0]>b){
            System.out.println(-1);
        }else{
            for(int y=0;y<a;y++){
                if(e[y]<b && e[y+1]>b){
                    System.out.println(e[y]);
                }
            }
        }
    }
}
