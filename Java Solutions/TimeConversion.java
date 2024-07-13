import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class TimeConversion{
    public static void main(String[]args){
        Scanner Imran=new Scanner(System.in);
        String Zidane=Imran.nextLine();
        String b=Zidane.substring(0,2);
        String c=Zidane.substring(3,5);
        String d=Zidane.substring(6,8);
        String e=Zidane.substring(8,10);
        int g = Integer.parseInt(b);
        int h = Integer.parseInt(c);
        int i = Integer.parseInt(d);
        String f="PM";
        String z="AM";
        if (e.equals(f) == true) {
            if(g!=12){
                g+=12;
                String j=Integer.toString(g);
                System.out.println(j+":"+c+":"+d);
            }else if (g==12){
                System.out.println(b+":"+c+":"+d);
            }
        }else if(e.equals(z) == true){
            if(g==12){
                String w="00";
                System.out.println(w+":"+c+":"+d);
            }else{
                System.out.println(b+":"+c+":"+d);
            }
        }
    }
}
