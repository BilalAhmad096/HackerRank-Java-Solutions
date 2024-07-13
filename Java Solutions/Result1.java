import java.io.*;
import java.math.*;
import java.util.*;
import java.util.Arrays;
public class Result1 {
    public static void main(String[]args){
        Scanner nun=new Scanner(System.in);
        int n=nun.nextInt();
        int a[]=new int[n];    
        for (int i =0; i < n; i++){
            a[i] = nun.nextInt();
        }
        int x=1;
        int t=0;
        int c=0;
        int pair=0;
        int socks=0;
        int socksSold=0;
        Arrays.sort(a);
	System.out.println(Arrays.toString(a));
        
        for(int i=0;i<n-1;i++){
            for (int j=0;j<n;j++){
                if(j==i){
                    continue;
                }     
                else if (a[j]==a[i]){
                    pair=pair+1;
                    c=c+1;        
                }
            }  
            i=i+c;
            c=0;
            socks=0;
            if(pair==0){
                socks=0;
                continue;
            } else if(pair==1){
                socks=1;
                continue;
            } else if (pair==2){
                socks=1;
                continue;
            } else if (pair==3){
                socks=2;
                continue;
            } else if (pair==4){
                socks=2;
                continue;
            } else if (pair>4){
                if((pair%2)==0){
                    socks=pair-3;
                } else{
                    socks=pair-2;
                }  
            } 
            socksSold=socks;   
        }
        System.out.println(socksSold);
    }
}
        
                
