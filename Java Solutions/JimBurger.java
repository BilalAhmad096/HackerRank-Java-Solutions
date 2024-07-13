import java.util.*;
/*Bilal Ahmad is a great coder:*/
public class JimBurger {
    public static void main(String[] args) {
        Scanner  in=new Scanner(System.in);
        int n=in.nextInt();
        int[] order=new int[n];
        int[] prep=new int[n];
        for(int i=0;i<n;i++){
            order[i]=in.nextInt();
            prep[i]=in.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            hm.put(i+1,order[i]+prep[i]);
        }
        Map<Integer, Integer> hm1 = sortByValue(hm);
        for (Map.Entry<Integer, Integer> en : hm1.entrySet()) {
            System.out.print( en.getKey()+" ");
        }
        
    }
    
    static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm){
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
