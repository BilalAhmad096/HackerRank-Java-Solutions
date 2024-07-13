import java.io.*;
import java.math.*;
import java.util.*;
public class LisaAnn{
    public static void main(String args[]){
        Scanner choti=new Scanner(System.in);
        int n=choti.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=choti.nextInt();
        }
        int min=a[0];
        int max=a[0];
        int badha=0;
        int ghata=0;
        for(int i=1;i<n;i++){   
            if(a[i]>max){
                max=a[i];
                badha+=1;
            }else if(a[i]<min){
                min=a[i];
                ghata+=1;
            }
        }
	int m[]=new int[2];
	m[0]=badha;
	m[1]=ghata;
	
	for(int i=0;i<2;i++){
		System.out.print(m[i]+" ");
	}
	//System.out.print(badha+" ");
        //System.out.print(ghata);
System.out.println(Arrays.toString(array));
        
        
    }
}