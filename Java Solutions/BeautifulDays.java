import java.text.*;
import java.util.*;
public class BeautifulDays{
    static int bilal(int[] a){
        int answer=0;
        for(int i=a[0];i<a[1]+1;i++){
            int num=i;
            int reversed=0;
            while(num!=0){
                int digit=num%10;
                reversed=reversed*10+digit;
                num/=10;
            }
            num=i;
            int q=Math.abs(num-reversed);
            if(q%a[2]==0){
                answer+=1;
                continue;
            }if(q==0){
                answer+=1;
                continue;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] a=new int[3];
        for(int i=0;i<3;i++){
            a[i]=in.nextInt();
        }
        int z=bilal(a);
        System.out.println(z);
    }
}
