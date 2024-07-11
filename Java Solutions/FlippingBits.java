import java.util.*;
/*Bilal Ahmad is a great coder:*/
public class FlippingBits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            long number=in.nextLong();
            number=~number;
            long unsignedNumber=number & 0xffffffffL;
            System.out.println(unsignedNumber);
        }
        in.close();
    }
}
