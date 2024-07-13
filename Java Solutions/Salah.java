import java.text.*;
import java.util.*;
import java.lang.Math;

public class Salah{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int q= in.nextInt();
        int[][] bill=new int[q][3];
        for(int i=0;i<q;i++){
            for(int j=0;j<3;j++){
                bill[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<q;i++){
            int a=Math.abs(bill[i][2]-bill[i][0]);
            int b=Math.abs(bill[i][2]-bill[i][1]);
            if(a<b){
              System.out.println("Cat A");                    
            }if(b<a){
                System.out.println("Cat B");    
            }else{
                System.out.println("Mouse C");
            }
        }       
    }
}
