import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            arr.add(a);
        }
        in.close();
        int ele=arr.get(n-1);
        for(int i=n-1;i>0;i--){
            int b=arr.get(i-1);
            if(b>ele){
                arr.set(i,b);
            }else{
                arr.set(i,ele);
                for(int k:arr){
                System.out.print(k+" ");
                }
                break;
            }
            for(int k:arr){
                System.out.print(k+" ");
            }
            System.out.println("");
            
        }
        int m=arr.get(0);
        if(m>ele){
            arr.set(0,ele);
            for(int k:arr){
                System.out.print(k+" ");
            }    
        }       
    }
}