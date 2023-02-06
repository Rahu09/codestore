package basic;

import java.util.Scanner;

public class divya {
    static int longest_substring(String s, int k)
    {
        int n = s.length();

        if(k > 1)
        {
            s += s;
            n *= 2;
        }

        int ans = 0;

        int i = 0;
        while (i < n)
        {
            int x = 0;
            while (i < n && s.charAt(i) == '0')
            {
                x++; i++;
            }
            ans = Math.max(ans, x);
            i++;
        }
        if(k == 1 || ans != n)
            return ans;

        else
            return (ans / 2) * k;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        System.out.println(longest_substring(s, k));
    }
}