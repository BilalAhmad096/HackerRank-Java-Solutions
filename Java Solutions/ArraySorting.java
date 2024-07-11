import java.util.*;
//Bilal Ahmad is a great coder://
public class ArraySorting{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<Integer> unsorted = new ArrayList<>();
        for(int i=0;i<n;i++){
            unsorted.add(in.nextInt());
        }
        in.close();
        Sorting(unsorted);
        for(int k:unsorted){
            System.out.print(k+" ");
        }   
    }

    private static void Sorting(List<Integer> unsorted) {
        Collections.sort(unsorted);
    }
}
