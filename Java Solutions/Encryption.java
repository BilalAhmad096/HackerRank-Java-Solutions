
import java.util.*;
//Bilal Ahmad is a great coder:\\
public class Encryption {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        in.close();
        encryption(s);
    }
    public static void encryption(String s) {
        List<Character> binspace=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') continue;
            else binspace.add(s.charAt(i));
        }
        int ceil=(int) Math.ceil(Math.sqrt(binspace.size()));
        for(int i=0;i<ceil;i++){
            for(int j=i;j<binspace.size();j+=ceil){
                System.out.print(binspace.get(j));
            }
            System.out.print(" ");
        } 
    }
}