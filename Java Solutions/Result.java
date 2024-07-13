import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.Arrays;
public class Result {
    public static void main(String[]args){
        Scanner nun=new Scanner(System.in);
        int n=nun.nextInt();
        int a[]=new int[n];    
        for (int i =0; i < n; i++){
            a[i] = nun.nextInt();
        }
        int x=1;
        int c=0;
        int pair=0;
        Arrays.sort(a);
	System.out.println(Arrays.toString(a));
        
        for(int i=0;i<n;i++){
            int temp=a[i];
            for (int j=0;j<n;j++){
                if(j==i){
                    continue;
                }     
                else if (a[j]==temp){
                    pair=pair+1;
                    c=pair;
                    x=c;
                    
                }
                i=i+x;
                c=0;
                x=0;
             
            }
        }
        System.out.println(pair);
    }
}
        
        
        
                
