import java.util.*;

public class Test {
    public static void main(String[] args) {
       Map<Integer,String>hashMap = new HashMap<>();
       Map<Integer,String>linkedHashMap = new LinkedHashMap<>();
       Map<Integer,String>treeMap = new TreeMap<>();

        testMap(hashMap);      //does not preserve the order in which the element was added
        System.out.println();
        testMap(linkedHashMap);//preserve the order
        System.out.println();
        testMap(treeMap);      //sort by key
    }
     public static void testMap(Map<Integer,String>map){
         map.put(22,"Bob");
         map.put(11,"Bob");
         map.put(33,"Mike");

         for (Map.Entry<Integer,String>entry:map.entrySet()){
             System.out.println(entry.getKey()+" : "+entry.getValue());
         }
     }
}
