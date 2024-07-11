import java.util.*;
public class Danish{
    public static void main(String[] args) {
        int max=0;
        Scanner in=new Scanner(System.in);
        String input=in.next();
        in.close();
        int[] fuck=new int[26];
        for(int i=0;i<input.length();i++){
            fuck[input.charAt(i)-'a']++;
            max=Math.max(fuck[input.charAt(i)-'a'],max);
        }
        System.out.println(max);
    }
}