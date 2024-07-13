import java.text.*;
import java.util.*;

public class EqualizeArray {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int out=equalizeArray(n,a);
        System.out.println("Number of elements to delete is: "+out);
    }
    
    public static int equalizeArray(int n,int[] a) {
        Arrays.sort(a);
        int count=0;
        int bahar=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count+=1;
                }
            }
            i+=count;
            if(count>bahar){
                bahar=count;
            }
            count=0;
        }
        return (n-(bahar+1));
    }

}
