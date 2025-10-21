package hashing;
import java.util.*;
import java.util.HashMap;

public class LinkedHashmaplec {
    public static void main(String[] args) {
        // creation
        LinkedHashMap<String, Integer> hm=new LinkedHashMap<>();

        // Insert
        hm.put("India",100);
        hm.put("scotland", 600);
        hm.put("Norway",60);
         
        System.out.println(hm);


    //     // get method

    //     int population=hm.get("India");
    //     System.out.println(population);

    //     // conatinsKey

    //     boolean ct=hm.containsKey("India");
    //     System.out.println(ct);

    //     //remove
    //    hm.remove("Norway");
    //     System.out.println(hm);


    //     // size
    //     System.out.println(hm.size());

    //     // isEmpty
    //     System.out.println(hm.isEmpty());

    //     // clear
    //    hm.clear();
    //    System.out.println(hm);
    //     System.out.println(hm.isEmpty());
    }
}
