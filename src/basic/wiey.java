package basic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class wiey {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(60);
        arr.add(60);
        arr.add(60);
        System.out.println(countPairs(arr));
    }
    public static long countPairs(List<Integer> durations) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int numPairs = 0;
        for (int i = 0; i < durations.size(); i++) {

            int d = durations.get(i);
            int modD = d % 60;
            int complement = (60 - modD) % 60;
            if (counts.containsKey(complement)) {
                numPairs += counts.get(complement);
            }
//            counts.put(modD, counts.getOrDefault(modD, 0) + 1);
            if(counts.containsKey(modD))
                counts.put(modD,counts.get(modD)+1);
            else counts.put(modD,1);
        }
        return numPairs;
    }
}
