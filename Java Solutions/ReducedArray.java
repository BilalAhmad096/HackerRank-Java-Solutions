import java.util.*;
public class ReducedArray {
    public int minSetSize(int[] arr){
        Set<Integer> Sett = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++) Sett.add(arr[i]);
        Arrays.sort(arr);
        List<Integer> bil=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                else break;
            }
            bil.add(count);
        }
        Collections.sort(bil,Collections.reverseOrder());
        int size=0;
        int out=0;
        for(int i=0;i<bil.size();i++){
            size+=bil.get(i);
            if(size>=arr.length/2){
                out=i+1;
                break;
            }
        }
        if(Sett.size()==1) return 1;
        return Sett.size()-out;
    }
}