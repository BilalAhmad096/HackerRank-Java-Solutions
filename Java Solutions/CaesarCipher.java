import java.util.*;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s=in.next();
        int k=in.nextInt();
        caesar(n,s, k);
        in.close();
    }
    public static String caesar(int n,String s, int k) {
        String compare="abcdefghijklmnopqrstuvwxyz";
        String nayi="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String output="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='-'){
                System.out.print('-');
                continue;
            }if(s.charAt(i)<93){
                if(s.charAt(i)+k>90){
                    int q=s.charAt(i)-'Z'+k-1;
                    char z=nayi.charAt(q);
                    System.out.print(z);
                    continue;
                }if(s.charAt(i)+k<=90){
                    int c=s.charAt(i)-'A'+k;
                    char z=nayi.charAt(c);
                    System.out.print(z);
                    continue;
                }
                continue;
            }if(s.charAt(i)>93){
                if(s.charAt(i)+k>122){
                    int q=s.charAt(i)-'z'+k-1;
                    char z=nayi.charAt(q);
                    System.out.print(z);
                    continue;
                }if(s.charAt(i)+k<=122){
                    int c=s.charAt(i)-'a'+k;
                    char z=compare.charAt(c);
                    System.out.print(z);
                    continue;
                }
            }
        }
        return output;
    }
}


