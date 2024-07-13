import java.util.*;
public class MathWorks{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        String[] one=new String[a];
        for(int i=0;i<a;i++){
            int y=in.nextInt();
            one[i]=Integer.toString(y);
        } 
        int b=in.nextInt();
        String[] two=new String[b];
        for(int i=0;i<b;i++){
            int y=in.nextInt();
            two[i]=Integer.toString(y);
        } 
        System.out.println(MathBhayya(one,two));
        in.close();
    }
    static int MathBhayya(String[] one,String[] two){
        int out=0;
        for(int i=0;i<one.length;i++){
            char[] bilal=one[i].toCharArray();
            char[] ahmad=two[i].toCharArray();
            for(int j=0;j<bilal.length;j++){
                int pehla=Integer.parseInt(Character.toString(bilal[j]));
                int dosra=Integer.parseInt(Character.toString(ahmad[j]));
                out+=Math.abs(pehla-dosra);
            }

        }
        return out;
    }
}