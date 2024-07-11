import java.util.*;
import java.math.*;
public class Danny{
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int n1=in.nextInt();
        StringBuilder one= new StringBuilder();
        StringBuilder two= new StringBuilder();
        for(int i=0;i<n1;i++) one.append(in.next());
        int n2=in.nextInt();
        for(int i=0;i<n2;i++) two.append(in.next());
        BigInteger pehla=new BigInteger(one.toString());
        BigInteger doosra=new BigInteger(two.toString());
        BigInteger difference = doosra.subtract(pehla);
        String number = difference.toString();
        while(number.length()>0){
            String danish=number.substring(0,1);
            System.out.println(danish);
            number=number.substring(1);
        }
        in.close();
    }
}