import java.text.*;
import java.util.*;
//Bilal Ahmad is a great coder://
public class CavityMap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String y="9";
        String u="X";
        for(int i=0;i<n;i++){
            String a=in.next();
            System.out.print(a.charAt(0));
            for(int j=1;j<n-1;j++){
                if(a.charAt(j)>a.charAt(j+1) && a.charAt(j)>a.charAt(j-1)){
                    System.out.print('X');
                }else{
                    System.out.print(a.charAt(j));
                }
            }
            System.out.print(a.charAt(n-1));
            System.out.println("");
        }
    }
}