package basic;

public class lac19 {
    public static void main(String[] args) {
        int []a = { 1,2,6,6,5};
        System.out.print(countofPairs(a) + "\n");
    }
    static int countofPairs(int[] a)
    {
        int n = a.length;
        int []freq = new int[n + 2];
        int maxi = -1;
        int mini = n+1;
        for(int i = 0;i<n;i++)
        {
            maxi = Math.max(maxi,a[i]);
            mini = Math.min(mini,a[i]);
        }
        for(int i = 0; i < n; ++i)
            freq[a[i]]++;

        return maxCount(freq,maxi,mini);
    }
    static int maxCount(int[] freq, int max,int min) {
        int n = freq.length - 1, ans = 0;
        for(int sum = 2*min; sum <= 2 * max; ++sum) {
            int possiblePair = 0;

            for(int firElement = 1; firElement < (sum + 1) / 2; firElement++) {
                if (sum - firElement <= max) {
                    possiblePair += Math.min(freq[firElement], freq[sum - firElement]);
                }
            }

            if (sum % 2 == 0) {
                possiblePair += freq[sum / 2] / 2;
            }
            ans = Math.max(ans, possiblePair);
        }
        return ans;
    }
}

