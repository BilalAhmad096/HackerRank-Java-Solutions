import java.util.*;
public class HollowDiamond {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%2==1) n+=1;
        int temp=n/2;
        for(int i=0;i<n/2;i++){
            int baad=0;
            for(int j=0;j<temp;j++){
                System.out.print("*");
                baad++;
            } 
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
                baad++;
            } 
            for(int j=baad;j<n;j++) System.out.print("*"); 
            System.out.println("");
            temp--;
        }

        int stars=2;
        for(int i=1;i<n/2;i++){
            int janta=0;
            for(int j=0;j<stars;j++){
                System.out.print("*");
                janta++;
            }
            for(int j=stars;j<n-stars;j++){
                System.out.print(" ");
                janta++;
            }
            for(int j=0;j<n-janta;j++){
                System.out.print("*");
            }
            System.out.println("");
            stars++;
        }
        in.close();
    }
}
