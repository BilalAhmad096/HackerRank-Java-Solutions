import java.util.*;
//Bilal Ahmad is a great coder:
public class BeautifulPair {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int elements=in.nextInt();
        List<Integer> A=new ArrayList<Integer>();
        List<Integer> B=new ArrayList<Integer>();
        for(int i=0;i<elements;i++){
            A.add(in.nextInt());
        }
        in.nextLine();
        for(int i=0;i<elements;i++){
            B.add(in.nextInt());
        }
        int out=beautifulPairs(A,B);
        System.out.println(out);
    }
    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        int count=0;
        for(int i=0;i<A.size();i++){
            for(int j=0;j<B.size();j++){
                int a=A.get(i);
                int b=B.get(j);
                if(a==b){
                    A.remove(i);
                    B.remove(j);
                    count++;
                    i--;
                    break;
                }
            }
        }
        if(A.isEmpty() || B.isEmpty()){
            return count;
        }else{
            return count+1;
        }
    }
}
