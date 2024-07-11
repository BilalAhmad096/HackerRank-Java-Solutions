import java.util.*;
class Faraz{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        bilal(n);
        in.close();
    }
    static void bilal(int n){
        int i=0;
        while(i<=n){
            for(int j=0;j<i;j++){
                if(j%2==0) System.out.print("0 ");
                else System.out.print("1 ");
            }
            System.out.println("");
            i++;
        }
    }
}
