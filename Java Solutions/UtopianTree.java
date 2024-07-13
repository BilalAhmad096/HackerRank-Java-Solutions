import java.text.*;
import java.util.*;

public class Solution {
    static int answer(int a[],int n){ 
        int[] e=new int[n]; 
        for(int i=0;i<n;i++){
            int h=0;
            for(int j=0;j<a[i]+1;j++){
                if(j%2==0){
                    h++;
                }if(j%2!=0){
                    h=2*h;
                }
            }
            e[i]=h;
        }
        return e;
    }
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }   
        int x=answer (a,n);    
    }
}
