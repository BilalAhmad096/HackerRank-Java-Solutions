import java.util.*;
public class Mathwork {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] kamran=new int[n];
        for(int i=0;i<n;i++) kamran[i]=in.nextInt();
        in.close();
        System.out.println(BilalAhmad(kamran));
    }
    static int BilalAhmad(int[] kamran){
        int max=-1;
        int one=Integer.MAX_VALUE;
        int two=0;
        for(int i=0;i<kamran.length;i++){
            if(kamran[i]<one){
                one=kamran[i];
                continue;
            }
            if(kamran[i]>two) two=kamran[i];
            if(two-one>0 && two-one>max) max=two-one;
        }
        return max;
    }
}
