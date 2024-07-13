import java.text.*;
import java.util.*;

public class TreasureStone {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            int a=in.nextInt();
            int b=in.nextInt();
            int[] c=new int[n];
            int j=n-1;
            int w=0;
            while(j>=0){
                c[j]=(j*a)+(w*b);
                j--;
                w++;
            }
            System.out.println("The Value on the Final stone could be one of the following:");
            Arrays.sort(c);
            for(int k=0;k<n;k++){
                System.out.print(c[k]+" ");
            }
            System.out.println("");
        }
    }
}
