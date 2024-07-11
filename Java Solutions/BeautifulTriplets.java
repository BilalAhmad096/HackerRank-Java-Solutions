import java.util.*;
//Bilal Ahmad is a great coder//

public class BeautifulTriplets {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int result=triplets(n,d,a);
        System.out.println("The number of triplets are : "+result);
        in.close();
    }
    static int triplets(int n, int d, int[] a){
        int count=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                if(a[j]==a[i]+d){
                    for(int k=j+1;k<n;k++){
                        if(a[k]==a[j]+d){
                            count++;
                        }
                    }
                }
            }
        }
        return count;  
    }
}
