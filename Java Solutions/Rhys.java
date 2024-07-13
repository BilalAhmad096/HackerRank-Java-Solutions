import java.text.*;
import java.util.*;

public class Rhys{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n+2];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
	a[n]=1;
	a[n+1]=1;
        for(int i=0;i<n+2;i++){
	    System.out.println(a[i]);

	}
        
    }
}
