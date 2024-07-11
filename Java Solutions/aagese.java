import java.util.*;
public class aagese {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        in.close();
        System.out.println(Bilal(a));
    }
    static boolean Bilal(String a){
        int b=a.length()-1;
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)==a.charAt(b)) b--;
            else return false;
        }
        return true;
    }
}   
