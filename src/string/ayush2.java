package string;

public class ayush2 {
    public static void main(String[] args) {
        String s = "zx:za:ee";
        String[] split = s.split(":");
        String ans = "";
        for (String value : split) {
            if (value.charAt(0) == value.charAt(1)) {
                ans += (char) ('A' + (int) value.charAt(0) - (int) 'a');
            } else {
                if (value.charAt(0) > value.charAt(1)) {
                    ans += (char) ('A' + split[0].charAt(1) - value.charAt(1) + 1);
                } else {
                    ans += (char) ('A' + split[1].charAt(1) - value.charAt(0) + 1);
                }
            }
        }
        System.out.println(ans);
    }
}