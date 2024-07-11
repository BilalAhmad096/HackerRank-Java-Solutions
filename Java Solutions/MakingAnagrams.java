import java.util.*;
//Bilal Ahmad is a great coder:\\
public class MakingAnagrams {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String first=in.next();
        String second=in.next();
        in.close();
        System.out.println(makingAnagrams(first,second));
    }
    static int makingAnagrams(String first, String second) {
        int[] one=new int[26];
        int[] two=new int[26];
        int del=0;
        for(int i=0;i<first.length();i++) one[first.charAt(i)-'a']+=1;
        for(int i=0;i<second.length();i++) two[second.charAt(i)-'a']+=1;
        for(int i=0;i<26;i++) del+=Math.abs(one[i]-two[i]);
        return del;  
    }
}