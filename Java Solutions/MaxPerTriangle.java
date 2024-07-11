import java.util.*;
/*Bilal Ahmad is a great coder:*/
public class MaxPerTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<Integer> sticks=new ArrayList<Integer>();
        for(int i=0;i<n;i++) sticks.add(in.nextInt());
        in.close();
        List<Integer> eshan=maximumPerimeterTriangle(sticks);
        for(int k:eshan) System.out.print(k+" ");
    }
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks){
        int sum=0;
        List<Integer> bilal=new ArrayList<Integer>();
        bilal.add(-1);
        Collections.sort(sticks);
        if(sticks.size()<3) return bilal;
        for(int i=0;i<sticks.size()-2;i++){
            for(int j=i+1;j<sticks.size()-1;j++){
                for(int k=j+1;k<sticks.size();k++){
                    if(sticks.get(i)+sticks.get(j)>sticks.get(k)){
                        if(sticks.get(i)+sticks.get(j)+sticks.get(k)>sum){
                            sum=sticks.get(i)+sticks.get(j)+sticks.get(k);
                            bilal.clear();
                            bilal.add(sticks.get(i));
                            bilal.add(sticks.get(j));
                            bilal.add(sticks.get(k));
                        }
                    }
                }
            }
        }
        return bilal;
    }
}
