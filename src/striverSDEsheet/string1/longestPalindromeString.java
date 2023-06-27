package striverSDEsheet.string1;

public class longestPalindromeString {
    public static void main(String[] args) {
        String s = "tattararrarattat";
        if (s == null || s.length() < 1) System.out.println("");;
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);//odd-palindrom (having 1,3,5 ele)
            int len2 = expandAroundCenter(s, i, i + 1);//even-palindrom (having 2,4,6 ele)
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        System.out.println(s.substring(start, end + 1));
    }
    //expand around center method
    //a bubble expanding around an ele in array until it is palindrome
    //check for two even-palindrom (having 2,4,6 ele) and odd-palindrom (having 1,3,5 ele)
    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
