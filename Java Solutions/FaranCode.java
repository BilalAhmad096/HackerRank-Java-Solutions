import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {

    /*
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    // Write your code here
    
    HashMap <Integer, Integer> map=new HashMap();
    
    for(int i=0;i<arr.size();i++)
    {
        if(map.containsKey(arr.get(i)))
        {
            map.put(arr.get(i),map.get(arr.get(i))+1);
        }
        else
        {
            map.put(arr.get(i),1);
        }
    }
    ArrayList <Integer> list=new ArrayList();
    
    for(int i=0;i<brr.size();i++)
    {
        if(map.containsKey(brr.get(i)))
        {
            if(map.get(brr.get(i))==1)
            map.remove(brr.get(i));
            else
            map.put(brr.get(i),map.get(brr.get(i))-1);
            
        }
        else
        {
            list.add(brr.get(i));
        }
    }
    Collections.sort(list);
    return list;

    }

}

public class FaranCode{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.missingNumbers(arr, brr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}