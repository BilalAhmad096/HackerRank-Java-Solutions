import java.text.*;
import java.util.*;


public class Sherlock {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

	System.out.println("Enter the number of test cases: ");
        int t=in.nextInt();
        for(int p=0;p<t;p++){
	    System.out.println("Enter the range: ");
            int a=in.nextInt();
            int b=in.nextInt();
            int out=squares(a,b);
            System.out.println("The number of squares in the given range are: "+out);
        }

    }
    
    public static int squares(int a, int b) {
        int r=0;
        int bhai=0;
        for(int i=1;i<b;i++){
            r=i*i;
            if(r>b){
                break;
            }
            if(r>=a && r<=b){
                bhai++;
            }
            
        }
        return bhai;
            

    }

}
