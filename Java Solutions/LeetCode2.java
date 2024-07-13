import java.util.*;
public class LeetCode2{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        in.close();
        System.out.println(reverseBits(x));
    }
    static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans = ans | (n & 1);
            n >>= 1;
        }
        return ans;
    }
}