import java.text.*;
import java.util.*;
//Bilal Ahmad is a great coder:
public class FlatlandStation {

    static int flatlandSpaceStations(int n,int m, int[] c) {
        int out=0;
        for(int i=0;i<n;i++){
            int e[]=new int[m];
            int r=0;
            for(int k:c){
                int f=Math.abs(i-k);
                e[r]=f;
                r++;
            }
            Arrays.sort(e);
            
            if(e[0]>out){
                out=e[0];
            }
              
        }
        return out;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] c=new int[m];
        for(int i=0;i<m;i++){
            c[i]=in.nextInt();
        }
        int result = flatlandSpaceStations(n,m,c);
        System.out.println(result);
        in.close();
    }
}
