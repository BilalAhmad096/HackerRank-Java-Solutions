import java.util.*;
//Bilal Ahmad is a great coder:\\
public class Anagram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            String s=in.next();
            int out=anagram(s);
            System.out.println(out);
        }
        in.close();
    }
    public static int anagram(String s) {
        int l=s.length();
        if(l%2==1) return -1;
        String first=s.substring(0,l/2);
        String last=s.substring(l/2,l);
        List<Character> charone = new ArrayList<>();
        List<Character> chartwo = new ArrayList<>();
        for(int i=0;i<l/2;i++){
            charone.add(first.charAt(i));
        } 
        for(int i=0;i<l/2;i++){
            chartwo.add(last.charAt(i));
        }
        for(int i=0;i<charone.size();i++){
            for(int j=0;j<chartwo.size();j++){
                if(charone.get(i)==chartwo.get(j)){
                    charone.remove(i);
                    chartwo.remove(j);
                    i--;
                    break;
                }
            }    
        }
        int a=charone.size();
        int b=chartwo.size();
        if(a>b) return b;
        else return a;
    }
}
