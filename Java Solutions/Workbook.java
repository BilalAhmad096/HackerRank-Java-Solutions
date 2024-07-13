import java.text.*;
import java.util.*;

public class Workbook {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int out=workbook(n,k,a);
        System.out.println(out);
        in.close();
    }
    public static int workbook(int n, int k, int[] a){
        int page=1;
        int count=1;
        int ret=0;
        for(int i=0;i<n;i++){
            int s=a[i];
            for(int j=0;j<s;j++){
                if(j+1==page){
                    ret++;
                }
                count++;
                if(count>k || j+1==s){
                    count=1;
                    page++;
                }
            }
        }
        return ret;
    }
}
