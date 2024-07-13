import java.text.*;
import java.util.*;
public class Farzi {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int count=n;
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=a[i];
        }
        Arrays.sort(b);
        
        int min=b[0];
        
        for(int i=0;i<n;i++){
            System.out.println(count);
            for(int j=0;j<n;j++){
                if(a[i]<min && a[i]>0){
                    min=a[i];
                }
            }
            for(int j=0;j<n;j++){
                a[j]-=min;
            }
            count=0;
            for(int j=0;j<n;j++){
                if(a[j]>0){
                    count++;  
                }
            }
            for(int j=0;j<n;j++){
                System.out.println(a[j]+" value");    
            }
            
            if(count<1){
                break;
            }
            
        }
    }
}
