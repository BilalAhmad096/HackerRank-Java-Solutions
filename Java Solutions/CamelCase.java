import java.util.*;
//Bilal Ahmad is a great coder:
public class CamelCase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int out=camelcase(s);
        System.out.println(out);
        in.close();
    }
    public static int camelcase(String s) {
        int count=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<95){
                count++;
            }else{
                continue;
            }
        }
        return count;
    }
}
