package hashing;
import java.util.*;
public class HashSetlec {
    public static void main(String[] args) {
        // operations
        // HashSet<Integer> set=new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(4);
        // set.add(1);
        // set.add(2);
        // System.out.println(set);

        // if(set.contains(2)){
        //     System.out.println("set contains");
        // }
        // if(set.contains(7)){
        //     System.out.println("set contains ");
        // }else{
        //     System.out.println("not");
        // }


        // set.remove(2);
        // System.out.println(set);

        // set.clear();
        // System.out.println(set.isEmpty())
        
        
        
        // iteration on hashset

        HashSet<String> set=new HashSet<>();
        set.add("Abc");
        set.add("Bcd");
        set.add("Cde");
        set.add("Dfe");
        set.add("Edr");
        set.add("Flf");
        System.out.println(set);
        // Iterator it=set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }


        // using advace loop
        // for(String s:set){
        //     System.out.println(s);
        // }


        // LINKEDHASHSET

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Abc");
        lhs.add("Bcd");
        lhs.add("Cde");
        lhs.add("Dfe");
        lhs.add("Edr");
        lhs.add("Flf");
        System.out.println(lhs );

        // TREESET- SAME 

    }
}
