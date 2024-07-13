import java.util.*;
public class SmartNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            System.out.println(isSmart(n) ? "YES":"NO");
        }
        in.close();
        
    }
    static boolean isSmart(int n){
        int factors=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) factors++;
        }
        System.out.print(factors);
        if(factors%2==0) return false;
        else return true;
    }
}