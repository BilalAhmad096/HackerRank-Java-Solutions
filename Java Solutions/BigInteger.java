import java.text.*;
import java.util.*;
import java.math.*;
public class ExtraLong {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        BigInteger a=factorial(n);
        System.out.println(a);
    }
    static BigInteger factorial(int n){
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));
        return f;
    }
}
