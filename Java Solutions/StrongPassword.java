import java.util.*;
//Bilal Ahmad is a great coder://

public class StrongPassword {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String password=in.next();
        int n=password.length();
        int out=minimumNumber(n,password);
        System.out.println(out);
        in.close();
        
    }
    public static int minimumNumber(int n, String password) {
        int cap=0;
        int sma=0;
        int dig=0;
        int spe=0;
        for(int i=0;i<n;i++){
            if(password.charAt(i)<91 && password.charAt(i)>64){
                cap++;
            }if(password.charAt(i)>96 && password.charAt(i)<123){
                sma++;
            }if(password.charAt(i)>47 && password.charAt(i)<58){
                dig++;
            }else{
                spe++;
            }
        }
        int bhai=0;
        if(cap>0){
            bhai++;
        }if(sma>0){
            bhai++;
        }if(dig>0){
            bhai++;
        }if(spe>0){
            bhai++;
        }
        int out=0;

        if(n<6 && bhai>3){
            out=6-bhai;
        }
        if(bhai<4){
            out=4-bhai;
            if(out<6){
                int f=6-out;
                out+=f;
            } 
        }
        return out;
    }
}
