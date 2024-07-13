
import java.text.*;
import java.util.*;
public class Mane{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
	int[] z=new int[n];
	for(int j=0;j<n;j++){
                z[j]=in.nextInt();
        }
	Arrays.sort(z);
	for(int i=0;i<n;i++){
	   System.out.print(z[i]+" ");
	}
   }
}
