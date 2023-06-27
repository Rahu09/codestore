package basic;

import java.util.*;

public class elitmus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> store = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            if(temp.charAt(0)=='a') store.add(sc.next());
            else System.out.println(find(sc.next(),store));
        }
    }
    public static int find(String word,ArrayList<String> store){
        int ans=0;
        for (int i = 0; i < store.size(); i++) {
            if(word.length()>store.get(i).length()) continue;
            String temp = store.get(i).substring(0,word.length());
            if (word.equals(temp)) {
                ans++;
            }
        }
        return ans;
    }
}
