import java.util.*;
public class MaxArraySum{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=in.nextInt();
        System.out.println(FindMaxSum(arr, n));
    }
    
    static int FindMaxSum(int arr[], int n){
        int incl = arr[0];
        int excl = 0;
        int excl_new;
        for (int i = 1; i < n; i++){
            /* current max excluding i */
            excl_new = (incl > excl) ? incl : excl;
            /* current max including i */
            incl = excl + arr[i];
            excl = excl_new;
        }
        return ((incl > excl) ? incl : excl);
    }
}