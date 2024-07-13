import java.util.*;
//Bilal Ahmad is a great coder:\\
public class CommonChild {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String first=in.next();
        String second=in.next();
        in.close();
        System.out.println(aamBacche(first,second));
    }
    static int aamBacche(String first, String second) {
        char[] one=first.toCharArray();
        char[] two=second.toCharArray();
        int pointer=0;
        int count=0;
        for(int i=0;i<one.length;i++){
            for(int k=pointer;k<two.length;k++){
                if(one[i]==two[k]){
                    count++;
                    System.out.print(two[k]);
                    pointer=k;
                    break;
                }
            }
        }
        return count;
    }
}