import java.util.*;
public class rwth {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        Ahmad();
    }
    static void Ahmad(){
        String b="Bilal Ahmad";
        StringBuffer bil=new StringBuffer(b);
        bil.reverse();
        System.out.println(bil.toString());
    }
}
