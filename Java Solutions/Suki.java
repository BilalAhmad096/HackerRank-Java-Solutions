import java.util.*;
public class Suki {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[] umbrella=new int[n];
        for(int i=0;i<n;i++) umbrella[i]=in.nextInt();
        System.out.println(getMinCount(umbrella,m));
        in.close();
    }
    public static int getMinCount(int[] umbrella, int m) {
		if (umbrella.length == 0 || m < 1){
			return -1;
        }
		int i = umbrella.length - 1;
		Arrays.sort(umbrella);
		int count = 0;
		while (m >= 0 && i >= 0) {
			count += m / umbrella[i];
			m = m % umbrella[i];
			i--;
		}
		return (m != 0) ? -1 : count;
	}
}