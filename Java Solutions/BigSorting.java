import java.math.*;
import java.text.*;
import java.util.*;
//Bilal Ahmad is a great coder://
public class BigSorting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<String> unsorted = new ArrayList<String>();
        for(int i=0;i<n;i++){
            unsorted.add(in.next());
        }
        ArrayList<BigInteger> sorted = new ArrayList<BigInteger>();
        //BigInteger bigIntegerStr=new BigInteger(str);
        for(BigInteger k:unsorted){
            a=new BigInteger(k);
            k=a;
        }
        
        BigInteger min=unsorted.get(0);
        for(BigInteger k:unsorted){
            min=unsorted.get(0);
            for(BigInteger k:unsorted){
                if(k<min){
                    min=k;
                }
                
            }
            unsorted.remove(k);
            sorted.add(min);
        }
        for(BigInteger K:sorted){
            System.out.println(K);
        }
    }
}
