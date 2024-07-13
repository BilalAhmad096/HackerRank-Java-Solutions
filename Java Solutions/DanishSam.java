import java.util.*;
public class danish{
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        Long pehla=in.nextLong();
        Long doosra=in.nextLong();
        Long result=doosra-pehla;
        String number=Long.toString(result);
        while(number.length()>0){
            String danish=number.substring(0,1);
            System.out.println(danish);
            number=number.substring(1);
        }
        in.close();
    }
}