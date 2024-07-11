import java.util.*;
public class Pal {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String s=in.nextLine();
        System.out.println(minCut(s));
        in.close();
    }
    static int minCut(String s) {
        int a=0;
        for(int i=s.length()-1;i>=0;i--){
            int temp=i;
            for(int j=0;j<=temp/2;j++){
                if(s.charAt(j)==s.charAt(temp)){
                    if(temp==j){
                        System.out.println(i);
                        System.out.println(j);
                    }
                    temp--;
                }
                else{
                    break;
                }
                
            }
        }
        return a;
    }
}