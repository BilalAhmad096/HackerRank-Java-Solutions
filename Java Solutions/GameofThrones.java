import java.util.*;
//Bilal Ahmad is a great Coder:\\
public class GameofThrones {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        in.close();
        int odd=gameOfThrones(s);
        if(odd>1) System.out.println("NO");
        else System.out.println("YES");
    }
    public static String sortString(String s) { 
      char characterArray[] = s.toCharArray(); 
      Arrays.sort(characterArray); 
      return new String(characterArray); 
    }
    public static int gameOfThrones(String s) {
        int a=s.length();
        String w=sortString(s);
        int odd=0;
        for(int i=0;i<a;i++){
            int count=1;
            for(int j=i+1;j<a;j++){
                if(w.charAt(i)==w.charAt(j)){
                    count++;
                }
            }
            if(count%2==1) odd++;
            i+=count-1;
        }
        return odd;
    }
}
