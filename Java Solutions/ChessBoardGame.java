import java.util.*;
/*Bilal Ahmad is a great coder:*/
public class ChessBoardGame {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            System.out.println((((x-1)/2)%2==0  && ((y-1)/2)%2==0)? "Second":"First");
        }
        in.close();
    }
}