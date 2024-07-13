import java.util.*;
public class DivisibleSumPair{
    public static void main(String[] args){
        Scanner bilal=new Scanner(System.in);
        int n=bilal.nextInt();
        int k=bilal.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=bilal.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((a[i]+a[j])%k==0){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
