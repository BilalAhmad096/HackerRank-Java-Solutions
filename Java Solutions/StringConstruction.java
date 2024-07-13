import java.util.*;
//Bilal Ahmad is a great coder:\\
public class StringConstruction {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            String s=in.next();
            System.out.println(stringConstruction(s));
        }
        in.close();
    }
    public static int stringConstruction(String s) {
       Set<Character> mukhtalif = new HashSet<>();
        for(char c : s.toCharArray()){
            mukhtalif.add(c);
        }
        return mukhtalif.size();
    }
}
