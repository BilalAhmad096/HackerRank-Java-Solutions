import java.util.*;
//Bilal Ahmad is a great coder:\\

public class DanishSamad{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        int j=in.nextInt();
        int k=in.nextInt();
        System.out.println(beautifulDays(i,j,k));
    }
    static int beautifulDays(int i, int j, int k){
        int count=0;
        for(int l=i;l<j;l++){
            String ulta=Integer.toString(l);
            String b=reverseString(ulta);
            int e = Integer.parseInt(b);
            int f=Math.abs(e-l);
            if(f%k==0){
                count++;
            }
        }
        return count;
    }
    static String reverseString(String ulta){
        StringBuilder str = new StringBuilder();
        str.append(ulta);
        str.reverse();
        String reverse=str.toString();
        return reverse;
    }
}
