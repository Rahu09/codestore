package basic;

import java.util.*;

public class subhaQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<List> input = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> in = new ArrayList<>();
            input.add(in);
            int value = sc.nextInt();
            input.get(i).add(value);
            int noOfRod = sc.nextInt();

            for (int j = 0; j < noOfRod; j++) {
                int rodLen = sc.nextInt();
                input.get(i).add(rodLen);
            }
        }
        for (List list : input) {
            int[] coins = new int[list.size() - 1];

            for (int j = 0; j < coins.length; j++) {
                coins[j] = (int) list.get(j+1);
            }
            System.out.println(minCoins(coins, coins.length, (int) list.get(0)));
        }
    }
    static int minCoins(int[] coins, int m, int V) {

        int[] table = new int[V + 1];
        table[0] = 0;

        for (int i = 1; i <= V; i++)  table[i] = Integer.MAX_VALUE;

        for (int i = 1; i <= V; i++) {
            for (int j = 0; j < m; j++)
                if (coins[j] <= i) {

                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }
        }
        if(table[V]==Integer.MAX_VALUE)  return -1;

        return table[V];

        //4 9 3 5 7 8 1000 6 23 17 90 280 300 10 14 3 7 5 4 99899243 3 55 33 99999

    }
}
