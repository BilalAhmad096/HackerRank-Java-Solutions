import java.text.*;
import java.util.*;
//Bilal Ahmad is a great coder:
public class FairRations {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        String out=fairRations(n,a);
        System.out.println(out);  
    }
    static String fairRations(int n, int[] a) {
        int bread=0;
        for(int i=0;i<n;i++){
            if(n<3){
                break;
            }
            if(i<n-1){
                if((a[i]%2)==1){
                    a[i]+=1;
                    a[i+1]+=1;
                    bread+=2;
                    
                }
                
            }if(i==n-1){
                if((a[i]%2)==1){
                    a[i]+=1;
                    a[i-1]+=1;
                    bread+=2;
                }
                
            }
        }
        
        int odd=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==1){
                odd++;
            }
        }
        if(odd==0 && bread>=0){
            String x=Integer.toString(bread);
            return x;
        }else{
            return ("NO");            
        }
        
    }
}
