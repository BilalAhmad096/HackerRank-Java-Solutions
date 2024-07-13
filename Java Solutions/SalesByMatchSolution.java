import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesbyMatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfSocks = sc.nextInt();
        int[] arrayOfSocks = new int[numberOfSocks];
        for (int i = 0; i < arrayOfSocks.length; i++) {
            arrayOfSocks[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
       
        int numberOfMatchingPairs = 0;

        /*
         If map does not contains pair of sock then put into map and
         set value to 1. If map contains then we remove that sock
         means we found 1 pair of socks. Delete that socks and
         increment the value of numberOfMatchingPairs
        */
        for (int i : arrayOfSocks) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.remove(i);
                ++numberOfMatchingPairs;
            }
        }
       
        System.out.println(numberOfMatchingPairs);
    }

}