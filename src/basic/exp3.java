package basic;

public class exp3 {
    public static void main(String[] args) {
        int h = 6;
        int[] cartoon = {30,11,23,4,20};
        int sum = 0;
        int minSpeed;
        for (int j : cartoon)
            sum += j;

        if (sum%h != 0)
            minSpeed = (sum/h)+1;
        else
            minSpeed = sum/h;
        
        while (true) {
            int currhour = 0;
            for (int j : cartoon) {
                int ans = 0;
                if (j % minSpeed != 0)
                    ans += (j / minSpeed) + 1;
                else
                    ans += (j / minSpeed);

                currhour = currhour + ans;
                if (currhour > h)
                    break;
            }
            minSpeed+=1;
            if (currhour<=h)
                break;
        }
        System.out.println(minSpeed-1);
    }
}