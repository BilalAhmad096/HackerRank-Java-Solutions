import java.util.*;
//Bilal Ahmad is a great coder:
public class ClosestNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(in.nextInt());
        }
        in.close();
        closestNumbers(list);
        
    }
    public static void closestNumbers(List<Integer> list) {
        Collections.sort(list);
        int min=list.get(list.size()-1);
        for(int k:list){
            for(int l:list){
                if(k==l){
                    continue;
                }
                if(Math.abs(k-l)<min){
                    min=Math.abs(k-l);
                }
            }
        }
        for(int k:list){
            for(int l:list){
                if((k-l)==min){
                    System.out.println(l+" "+k+" ");
                }
                
            }
        
        }    
        
        
    }
}
