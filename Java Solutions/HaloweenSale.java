import java.text.*;
import java.util.*;
//Bilal Ahmad is a great Coder:
public class HaloweenSale {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        int d=in.nextInt();
        int m=in.nextInt();
        int s=in.nextInt();
        int out=howManyGames(p,d,m,s);
        System.out.println(out);
        in.close();

    }
    public static int howManyGames(int p, int d, int m, int s) {
        int price=p;
        int result=0;
        while(s>=price){
            s-=price;
            result++;
            price=Math.max(m, price - d);
        }
        return result;
    }

}
