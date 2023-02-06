package basic;
import java.util.*;

public class createPin {
    public static void main(String[] args) {
        int[] arr = {12,2,36,10,217,36,5,36,15,10};
        System.out.println(creatPin(arr, arr.length));
    }
    public static int creatPin(int[] arr, int length) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxkey = Integer.MIN_VALUE, maxV = Integer.MIN_VALUE;
        int maxkey2 = Integer.MIN_VALUE, maxV2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1 );
            }else{
                map.put(arr[i],0);
            }
        }

        for (Map.Entry mapElement : map.entrySet()) {
            int key = (int) mapElement.getKey();
            int value = (int) mapElement.getValue();

            if (value == maxV && key > maxkey) { maxkey = key;}
            if (value > maxV) {
                maxkey = key;
                maxV = value;
            }
        }
        for (Map.Entry mapElement : map.entrySet()) {
            int key = (int) mapElement.getKey();
            int value = (int) mapElement.getValue();
            if (key==maxkey) {
                continue;
            }
            if (value == maxV2 && key > maxkey2) { maxkey2 = key;}
            if (value > maxV2) {
                maxkey2 = key;
                maxV2 = value;
            }
        }
        String s = Integer.toString(maxkey2)+Integer.toString(maxkey);
        return Integer.parseInt(s);
    }
}
