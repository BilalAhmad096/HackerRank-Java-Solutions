import java.text.*;
import java.util.*;
//Bilal Ahmad is a great coder//

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> ab=new HashMap();
        ab.put("UK",44);
        ab.put("India",91);
        ab.put("Pakistan",92);
        ab.put("USA",01);
        System.out.println("Country code of India is: "+ab.get("India"));
        System.out.println(ab);
        ab.remove("Pakistan");
        System.out.println("after removal:");
        System.out.println(ab);
        
        for(String key:ab.keySet()){
            System.out.println(key+" code is: " + ab.get(key));
        }
        
        
    }
}
