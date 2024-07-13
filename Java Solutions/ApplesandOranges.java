import java.io.*;
import java.math.*;
import java.util.*;
public class ApplesandOranges{
    public static void main(String args[]){
        Scanner Imran=new Scanner(System.in);
        int[] a=new int[2];
        int[] b=new int[2];
        int[] c=new int[2];
        for(int i=0;i<2;i++){
            a[i]=Imran.nextInt();
        }
        for(int i=0;i<2;i++){
            b[i]=Imran.nextInt();
        }
        for(int i=0;i<2;i++){
            c[i]=Imran.nextInt();
        }
        int s=a[0];
        int t=a[1];
        int u=b[0];
        int v=b[1];
        int w=c[0];
        int x=c[1];
        int[] m=new int [w];
        int[] n=new int [x];
        for(int i=0;i<w;i++){
            m[i]=Imran.nextInt();
        }
        for(int i=0;i<x;i++){
            n[i]=Imran.nextInt();
        }
        int apple=0;
        int oranges=0;
        for(int i=0;i<w;i++){
            if((m[i]+u)>(s-1)){
                if((m[i]+u)<(t+1)){
                    apple+=1;
                }
            }
        }
        for(int i=0;i<x;i++){
            if((n[i]+v)<(t+1)){
                if((n[i]+v)>(s-1)){
                    oranges+=1;
                }
            }
        }    
        System.out.println(apple);
        System.out.println(oranges); 
    }
}
