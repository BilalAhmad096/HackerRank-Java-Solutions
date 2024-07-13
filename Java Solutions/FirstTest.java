import java.util.*;
//Bilal Ahmad is a great coder:\\
public class FirstTest{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int [][] image=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                image[i][j]=in.nextInt();
            }
        }
        imageBanao(n,m,image);
    }
    static void imageBanao(int n,int m,int [][] image){
        for(int i=0;i<n;i++){
            int b=m;
            for(int j=0;j<m/2;j++){
                int temp=image[i][b-1];
                image[i][b-1]=image[i][j];
                image[i][j]=temp;
                b--;
            }
        }
        int a=n;
        for(int i=0;i<n/2;i++){
            int[] temp=new int[m];
            temp=image[i];
            image[i]=image[a-1];
            image[a-1]=temp;
            a--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
}