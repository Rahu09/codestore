package Tree;
import java.util.*;

public class findAllPath {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        ans.add(22);
        ans.add(11);
        ans.add(44);
        List<Integer> temp = new ArrayList<>(ans);
        temp.remove(2);
        System.out.println(ans);
        System.out.println(temp);
    }
}
