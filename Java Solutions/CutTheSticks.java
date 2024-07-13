import java.text.*;
import java.util.*;
public class CutTheSticks {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int min=a[0];
	int max=0;
	for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }    
        for(int j=0;j<n;j++){
            if(a[j]<min && a[j]>0){
               min=a[j];
            }
        }
	System.out.println(min);
	System.out.println(max);
	for(int j=0;j<n;j++){
                a[j]-=min;
        }
	for(int j=0;j<n;j++){
            System.out.println(a[j]);
        }
        
    }

}
