import java.util.*;
/*Bilal Ahmad is a great coder:*/
public class LargestPermutation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        List<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++) arr.add(in.nextInt());
        in.close();
        List<Integer> bilal=largestPermutation(k,arr);
        for(int l:bilal) System.out.print(l+" ");
    }
    static List<Integer> largestPermutation(int k, List<Integer> arr) {
        List<Integer> bahar=new ArrayList<Integer>(arr);
        List<Integer> temporary=new ArrayList<Integer>(arr);
        Collections.sort(temporary,Collections.reverseOrder());
        if(k>arr.size()){
            Collections.sort(arr);
            return arr;
        }
        for(int i=0;i<k;i++){
            int ind=arr.indexOf(temporary.get(i));  
            int temp=bahar.get(i);
            bahar.set(i,temporary.get(i));
            bahar.set(ind,temp);   
        }
        return bahar;
    }
}
