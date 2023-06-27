package Hash.map;
import java.util.HashMap;

public class findDistEleWindow {
    public static void main(String[] args) {
        //find dist ele within a window of given size
        int[] arr = {1,2,2,1,3,1,1,3};
        int k=4;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);

            if(i>k-2){
                if(i>k-1){
                    map.put(arr[i-k],map.get(arr[i-k])-1);
                    if(map.get(arr[i-k])==0)
                        map.remove(arr[i-k]);
                }
                System.out.println(map.size());
            }
        }
    }
}
