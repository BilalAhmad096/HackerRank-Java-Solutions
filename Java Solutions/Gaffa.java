import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class Gaffa{
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
        int a=n*m;
        int f=0;
        int q=0;
        int[] e=new int[a];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                f=c[i]+d[j];
                e[q]=f;
                q++;
            }
            
        }
        Arrays.sort(e);
        if(e[0]>b){
            System.out.println(-1);
        }else{
            for(int o=0;o<a;o++){
                if(e[o]>b){
                    System.out.println(e[o-1]);
                }
            }
        }
    }
}
