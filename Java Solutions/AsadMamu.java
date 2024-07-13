import java.io.*;
import java.util.*;

public class Result {
    public static void main(String[]args){
        Scanner nun=new Scanner(System.in);
	int temp=0;
	int temp2=0;
        int n=nun.nextInt();
	int a[]=new int[n];
	
        for (int i =0; i < n; i++){
            a[i] = nun.nextInt();
        }
	int max=a[0];
	for(int i=1;i<n;i++){
	 if (a[i]>max){
	    max=a[i];
 	  
	 }
	
	}
	for(int i=0;i<n;i++){
	  if(a[i]==max){
	   temp=temp+1;
	  }
	}
	System.out.println(temp);
	        
    }
}    
    