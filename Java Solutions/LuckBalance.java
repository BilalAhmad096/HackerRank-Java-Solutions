import java.util.*;
/*Bilal Ahmad is a great coder:*/
public class LuckBalance {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        List<Integer> zero=new ArrayList<Integer>();
        List<Integer> ones=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int luck=in.nextInt();
            int val=in.nextInt();
            if(val==0) zero.add(luck);
            else ones.add(luck);
        }
        System.out.println(luckBalance(k,zero,ones));
        in.close();
    }
    static int luckBalance(int k,List<Integer> zero,List<Integer> ones){
        int balance=0;
        for(int l:zero) balance+=l;
        Collections.sort(ones);
        for(int i=0;i<ones.size();i++){
            if(i<ones.size()-k) balance-=ones.get(i);
            else  balance+=ones.get(i);
        }
        return balance;
    }
}