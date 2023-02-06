package Hash.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class allSetMethods {
    public static void main(String[] args) {
        int[] arr1 = {-1,5,2,3,10,15,5,10};
        int[] arr2 = {10,10,6,7,4,15};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int k : arr1) set1.add(k);
        System.out.println("set1-> "+set1);
        for (int k : arr2) set2.add(k);
        System.out.println("set2-> "+set2);

        //Size
        System.out.println("size of set1 is : " + set1.size()); //6

        //Search
        System.out.println("in set 1, ele 2 is");
        if(set1.contains(2))
            System.out.println("present");
        // O/P-> true

        //Delete
        set1.remove(2);
        System.out.println("after removing ele 2 from set 1");
        if(!set1.contains(2))
            System.out.println("absent");
        System.out.println();
        // O/P-> false

        //Iteration - HashSet does not have an order
        Iterator<Integer> i = set1.iterator();
        while (i.hasNext())
            System.out.print(i.next()+", ");
        // O/P-> -1, 3, 5, 10, 15,
        System.out.println();


        //isEmpty
        if(!set1.isEmpty())
            System.out.println("set1 is not empty");

        //cloning a hashset( without referencing to another set)
        //i.e changes in set1 will not be visible in set
        HashSet<Integer> set = new HashSet<>(set1);
        System.out.println("set-> "+set);

        //adding all ele of one set to another
        set2.addAll(set1);
        System.out.println(set2);

        //converting set to Array
        Object[] arr = set.toArray();
        System.out.println();
        for (Object o : arr) {
            System.out.println(o);
        }

        //converting set to string
        String str = set.toString();
        System.out.println(str);
    }
}
