import java.util.*;
public class Hashing{
    
public static void main(String[] args) {
    // HashSet<Integer> set=new HashSet<>();
    // set.add(1);
    // set.add(2);
    // set.add(5);
    // set.add(5);
    // if(set.contains(67)){
    //     System.out.println("contains elesment");
    // }else{
    //     System.out.println("doesnt contain");
    // }
    // System.out.println(set);
    // Iterator it=set.iterator();
    // while(it.hasNext()){
    //     System.out.println(it.next());
    // }
    HashMap<Integer,String> map=new HashMap<>();
    map.put(2, "meow");
    map.put(7,"mreowow");
   for(Map.Entry<Integer,String> it :map.entrySet()){
        System.out.println(it.getKey());
        System.out.println(it.getValue());
   }

}
}
