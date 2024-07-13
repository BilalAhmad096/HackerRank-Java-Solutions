import java.text.*;
import java.util.*;
public class Clouds1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int x=jumpingJhapak(n,a,k);
        System.out.println(x);
    }
    static int jumpingJhapak(int n,int[] a, int k) {
        int energy=100;
        int i=0;
        int currCloud=0;
        do{
            currCloud=(currCloud+k)%n;
            energy-=1;
            if(a[i]==1){
                energy-=2;
            }
            i++;
        }while(currCloud!=0);
        return(energy);
          
    }
}
