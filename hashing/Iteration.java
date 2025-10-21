package hashing;
import java.util.*;
public class Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("scotland", 600);
        hm.put("Norway",60);
        hm.put("uk", 400);
        hm.put("Indonesia", 50);

       

        // hm.entrySet():can be used than no nedd for extra loop;
        //System.out.println(hm.entrySet());

         // Iteration
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key="+k+ ","+hm.get(k));
        }

        
    }
}
