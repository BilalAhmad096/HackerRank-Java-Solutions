import java.util.*;
//Bilal Ahmad is a great coder:
public class StrangeCounternew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        in.close();
        long upperBound = 4;
        long lowerBound = 1;
        long upperValue = 6;
        //Find the bounds of t
        while(t > upperBound)
        {
            lowerBound = upperBound;
            upperBound = (upperBound+upperValue);
            upperValue = upperBound + 2;
        }
        
        //When t is on a boundry        
        if(t == upperBound)
        {
            System.out.println(upperValue);
        }
        else
        {
            System.out.println(lowerBound+2 - (t-lowerBound));    
        }
        
        
    }
}