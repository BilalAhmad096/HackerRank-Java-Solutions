import java.util.*;
public class LeetCode1 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        in.close();
        System.out.println(reverseBits(x));
    }
    static int reverseBits(int n) {
        String p=Integer.toBinaryString(n);
        StringBuilder junaid=new StringBuilder();
        junaid.append(p);
        junaid.reverse();
        String a=junaid.toString();
        int calc=Integer.parseInt(a,2);
        return (calc);
    }
}