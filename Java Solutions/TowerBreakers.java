import java.util.*;
/*Bilal Ahmad is a great coder:*/
public class TowerBreakers{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            int m=in.nextInt();
            System.out.println(towerBreakers(n,m));
        }
        in.close();
    }
    static int towerBreakers(int n, int m) {
        return 1;
    }
}
