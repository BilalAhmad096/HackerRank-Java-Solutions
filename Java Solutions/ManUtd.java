import java.text.*;
import java.util.*;
public class ManUtd {
    public static void main(String[] args){
        Scanner Samra=new Scanner(System.in);
        int n=Samra.nextInt();
        int k=Samra.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=Samra.nextInt();
        }
        int paid=Samra.nextInt();
        int balance=0;
        for(int i=0;i<n;i++){
            balance+=b[i];
        }
        balance-=b[k];
        if((balance/2)==paid){
            System.out.println("Bon Appetit");
        }else{
            int y=paid-(balance/2);
            System.out.println(y);
        }  
    }
}
