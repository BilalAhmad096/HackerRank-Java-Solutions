import java.util.*;
public class Millenium {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
            for(int i=0;i<t;i++){
                int n=in.nextInt();
                int[] prices=new int[n];
                for(int j=0;j<n;j++) prices[j]=in.nextInt();
                System.out.println(Bilal(prices));
            }
        in.close();
    }
    static int Bilal(int[] prices){
        int fayda=0;
        for(int k=0;k<prices.length;k++){
            int bhai=0;
            for(int l=k+1;l<prices.length;l++){
                if(prices[l]-prices[k]>bhai) bhai=prices[l]-prices[k];
            }
            fayda+=bhai;
        }        
        return fayda;
    }
}
