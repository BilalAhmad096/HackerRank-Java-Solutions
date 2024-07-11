import java.util.*;
public class DanishFinal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] fuck=new int[n];
        for(int i=0;i<n;i++){
            fuck[i]=in.nextInt();
        }
        Arrays.sort(fuck);
        for(int i=1;i<n;i++){
            if(fuck[i]-fuck[i-1]==2){
                System.out.println(fuck[i]-1);
                break;
            }
        }
        in.close();
    }
}
