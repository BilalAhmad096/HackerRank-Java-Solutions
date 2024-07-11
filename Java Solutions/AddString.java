import java.util.*;
public class AddString {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String num1=in.next();
        String num2=in.next();
        System.out.println(addStrings(num1, num2));
        in.close();
        
    }
    static String addStrings(String num1, String num2) {
        StringBuilder input1 = new StringBuilder(num1);
        StringBuilder input2 = new StringBuilder(num2);
        input1.reverse();
        input2.reverse();
        num1=input1.toString();
        num2=input2.toString();
        int i=0;
        StringBuilder result = new StringBuilder();
        int carry=0;
        while(i<num1.length() || i<num2.length()){
            String a=num1.substring(i,i+1);
            int b=Integer.parseInt(a);
            String c=num2.substring(i,i+1);
            int d=Integer.parseInt(c);
            int e=b+d+carry;
            if(e>9){
                String f=Integer.toString(e);
                String g=f.substring(0,1);
                String h=f.substring(1,2);
                carry=Integer.parseInt(g);
                result.append(h);
            }else{
                result.append(Integer.toString(e));
            }
            carry=0;
        }
        result.reverse();
        return result.toString();
    }
}
