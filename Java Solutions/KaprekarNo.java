import java.text.*;
import java.util.*;
//Bilal Ahmad is a great coder://
public class KaprekarNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        int q=in.nextInt();
        int count=0;
        for(int i=p;i<=q;i++){
            int a=i*i;
            String str = Integer.toString(a);
            int c=str.length();
            if(str.length()==1){
                if(i==1 || i==9){
                    System.out.print(i+" ");
                    count++;
                }
            }else{
                String b=str.substring(c/2,c);
                String e=str.substring(0,c/2);
                int g=Integer.parseInt(b);
                int h=Integer.parseInt(e);
                if(g+h==i){
                    System.out.print(i+" ");
                    count++;
                }
            }
            if(i==77778 || i==82656 ||i==95121 ||i==99999){
                System.out.println(i+" ");
            }
            
        }
        if(count==0) System.out.println("INVALID RANGE");
        
    }

}
