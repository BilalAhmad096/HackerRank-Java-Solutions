import java.util.*;
//Bilal Ahmad is a great coder:

public class MarsExploration {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int n=marsExploration(s);
        System.out.println(n);
        in.close();
    }
    public static int marsExploration(String s) {
        int a=s.length();
        int count=0;
        for(int i=0;i<a;i++){
            if(s.charAt(i)!='S'){
                count++;
            }if(s.charAt(i+1)!='O'){
                count++;
            }if(s.charAt(i+2)!='S'){
                count++;
            }
            i+=2;   
        }
        return count;
    }
}
