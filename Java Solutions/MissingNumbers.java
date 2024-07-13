import java.util.*;
//Bilal Ahmad is a great coder:\\
public class MissingNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Integer> arr=new ArrayList<Integer>();
        List<Integer> brr=new ArrayList<Integer>();
        int n=in.nextInt();
        for(int i=0;i<n;i++) arr.add(in.nextInt());
        int t=in.nextInt();
        for(int i=0;i<t;i++) brr.add(in.nextInt());
        List<Integer> sad=missingNumbers(arr,brr);
        for(int k:sad) System.out.print(k+" ");
    }
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        for(int i=0;i<arr.size();i++){
            for (int j=0;j<brr.size();j++){
                int a=arr.get(i);
                int b=brr.get(j);
                if(a==b){
                    brr.remove(j);
                    arr.remove(i);
                    i--;
                    break;
                }
            }
        }
        Collections.sort(brr);
        for(int i=1;i<brr.size();i++){
            int a=brr.get(i);
            int b=brr.get(i-1);
            if(a==b){
                brr.remove(i);
            } 
        }
        return brr;
    }
}
