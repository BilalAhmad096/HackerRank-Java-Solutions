import java.text.*;
import java.util.*;

public class AhmadBilal{
    public static void main(String[]args){
        Scanner bilal=new Scanner(System.in);
        int steps=bilal.nextInt();
        String input=bilal.next();
        int b=0;
        int c=0;
        int d=0;
        for(int i=0;i<steps;i++){
            char a=input.charAt(i);
            if(a=='U'){
                b++;
            }else{
                c++;
            }
            if(b==c){
                d++;
            }
        }
        //d=d-1;
        System.out.println(d);
    }
    
}
