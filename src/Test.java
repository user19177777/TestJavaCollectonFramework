import java.util.*;

public class Test {
    public static void main(String[] args) {
       Set<String>hashSet = new HashSet<>();
       Set<String>linkedHashSet = new LinkedHashSet<>();
       Set<String>treeSet = new TreeSet<>();

       testSet(hashSet);
       System.out.println();
       testSet(linkedHashSet);
       System.out.println();
       testSet(treeSet);
    }
    public static void testSet(Set<String>set){
        set.add("Zak");
        set.add("Mike");
        set.add("Don");
        set.add("Tom");
        set.add("Aron");

        for (String a:set){
            System.out.print(a);
        }
    }
}
