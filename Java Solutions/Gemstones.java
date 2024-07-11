import java.util.*;
public class Gemstones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Set<Character> gemstones = stringToSet(in.nextLine());        
        for(int i=1; i<n ;i++) gemstones.retainAll(stringToSet(in.nextLine()));
        in.close();
        System.out.print(gemstones.size());
    }
    public static Set<Character> stringToSet(String s){
        Set<Character> set = new HashSet<Character>(26);
        for (char c : s.toCharArray())
            set.add(Character.valueOf(c));
        return set;
    }
}