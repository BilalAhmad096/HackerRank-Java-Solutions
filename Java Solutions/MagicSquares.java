import java.util.*;
//Bilal Ahmad is a great coder:\\
public class MagicSquares {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[][] s = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                s[i][j]=in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
    static int formingMagicSquare(int[][] s) {
        ArrayList<int[][]> options = new ArrayList<>();
        int[][] tmp = new int[][]{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        options.add(tmp);
        tmp = new int[][]{{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
        options.add(tmp);
        tmp = new int[][]{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        options.add(tmp);
        tmp = new int[][]{{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        options.add(tmp);
        tmp = new int[][]{{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
        options.add(tmp);
        tmp = new int[][]{{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};
        options.add(tmp);
        tmp = new int[][]{{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};
        options.add(tmp);
        tmp = new int[][]{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        options.add(tmp);
        int min=Integer. MAX_VALUE;
        int sum=0;
        for (int[][] option:options) {
            for (int i=0;i<3;i++) {
                for (int j=0;j<3;j++) {
                    sum+=Math.abs(option[i][j] - s[i][j]);
                }
            }
            if(sum<min){
                min=sum;
            }
            sum=0;
        }
        return min;
    }
}
