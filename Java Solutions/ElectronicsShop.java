 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ElectronicsShop{
    static int getMoneySpent(Integer[] keyboards, Integer[] drives, int s){
            int max=-1;
        for(int i=keyboards.length-1;i>=0;i--)
            {
            for(int j=drives.length-1;j>=0;j--)
                {
                if(keyboards[i]+drives[j]<=s && max<keyboards[i]+drives[j])
                    max=keyboards[i]+drives[j];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[] keyboards = new Integer[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        Integer[] drives = new Integer[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
           Arrays.sort(drives, Collections.reverseOrder());
        Arrays.sort(keyboards, Collections.reverseOrder());
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1             if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
