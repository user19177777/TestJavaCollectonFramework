import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer>arrayList = new ArrayList<>();
        List<Integer>linkedList = new LinkedList<>();

        measureTimeAdd(arrayList);  //faster
        measureTimeAdd(linkedList);

        measureTimeAdd2(arrayList);
        measureTimeAdd2(linkedList);//faster

        measureTimeGet(arrayList);
        measureTimeGet(linkedList);
    }

    //add to end of the list
    public static void measureTimeAdd(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            list.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish-start);
    }


    //add to start of the list
    public static void measureTimeAdd2(List<Integer>list){
        long start = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            list.add(0,i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish-start);
    }

    //get element
    public static void measureTimeGet(List<Integer>list){
        long start = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            list.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish-start);
    }
}
