import java.text.*;
import java.util.*;

public class Solution {
    public static int appendAndDelete(String s, String t, int n) {
        int q=s.length();
        int w=t.length();
        int bada=0;
        int chota=0;
        if(q>w){
            bada=q;
        }else{
            bada=w;
        }
        if(q>w){
            chota=w;
        }else{
            chota=q;
        }
        int count=0;
        for(int i=0;i<chota;i++){
            if(s.charAt(i)==t.charAt(i)){
                count+=1;
            }else{
	        break;
	    }
        }
        int r=chota-count;
        int y=bada-count;
	return r+y;
        
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String t=in.nextLine();
        int n=in.nextInt();
        int out=appendAndDelete(s,t,n);
        System.out.println(out);
        
    }
}
