import java.util.*;
//Bilal Ahmad is a great coder:\\
public class CakeWalk {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<Integer> calorie=new ArrayList<Integer>();
        for(int i=0;i<n;i++) calorie.add(in.nextInt());
        in.close();
        System.out.println(marcsCakewalk(calorie));
    }
    static long marcsCakewalk(List<Integer> calorie) {
        Collections.sort(calorie);
        Collections.reverse(calorie);
        long distance=0;
        for(int i=0;i<calorie.size();i++){
            double result = Math.pow(2,i);  
            long power=(long) result;
            distance+=calorie.get(i)*power;  
        }
        /*Indeed he is a great coder:
        Mashallah :-)*/
        return distance;
    }
}
