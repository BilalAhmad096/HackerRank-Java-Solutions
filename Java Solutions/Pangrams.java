import java.util.*;
//Bilal Ahmad is a great coder:
public class Pangrams{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        in.close();
        haiYaNai(s);
    }
    public static void haiYaNai(String s){
        String a=s.toUpperCase();
        int character=65;
        int alfaaz=0;
        while(character<91){
            for(char hurf : a.toCharArray()){
                if(hurf==character){
                    alfaaz++;
                    break;
                }else{
                    continue;
                }
            }
            character+=1;
        }
        if(alfaaz==26) System.out.println("pangram");
        else System.out.println("not pangram");
    }
}